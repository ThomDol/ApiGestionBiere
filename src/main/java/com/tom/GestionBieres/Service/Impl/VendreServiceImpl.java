package com.tom.GestionBieres.Service.Impl;

import com.tom.GestionBieres.Mapper.VendreMapper;
import com.tom.GestionBieres.Service.VendreService;
import com.tom.GestionBieres.entity.Article;
import com.tom.GestionBieres.entity.Ticket;
import com.tom.GestionBieres.entity.Vendre;
import com.tom.GestionBieres.entityDto.VendreDto;
import com.tom.GestionBieres.repository.ArticleRepository;
import com.tom.GestionBieres.repository.TicketRepository;
import com.tom.GestionBieres.repository.VendreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VendreServiceImpl implements VendreService {
    private VendreRepository vendreRepository;
    private TicketRepository tickeRepository;
    private ArticleRepository articleRepository;

    @Override
    public List<VendreDto> findAll() {
        List<Vendre> ventes=this.vendreRepository.findAll();
        return ventes.stream().map(VendreMapper::mapToVendreDto).toList();
    }

    public List<VendreDto> findByAnnee (int annee){
        List<Vendre> ventes = new ArrayList<>();
        List<Ticket> tickets = this.tickeRepository.findAllByAnnee(annee).stream().filter(ticket->ticket.getAnnee()==annee).collect(Collectors.toList());
        for(Ticket ticket:tickets){
            List<Vendre> ventesTemp= this.vendreRepository.findAllByTicket(ticket);
            for (Vendre vente:ventesTemp){ventes.add(vente);}
        }
        return ventes.stream().map(VendreMapper::mapToVendreDto).toList();
    }

   public List<VendreDto> findByAnneeAndByArticleNameAndVolume (int annee, String nomArticle,int volume){
        List<Ticket> tickets = this.tickeRepository.findAllByAnnee(annee);
        Article article = this.articleRepository.findByNomArticleAndVolume(nomArticle, volume);
        List<Vendre> ventes = new ArrayList<>();
        for(Ticket ticket:tickets){
            List<Vendre> ventesFiltered = this.vendreRepository.findAllByTicketAndArticle(ticket,article);
            for(Vendre vente:ventesFiltered){
                ventes.add(vente);
            }
        }
        return ventes.stream().map(VendreMapper::mapToVendreDto).toList();
    }


    public List<VendreDto> findByArticleNameAndVolume (String nomArticle,int volume){
        Article article = this.articleRepository.findByNomArticleAndVolume(nomArticle, volume);
        List<Vendre> ventes=this.vendreRepository.findAllByArticle(article).stream().filter(vente->vente.getArticle().getVolume()==volume).collect(Collectors.toList());
       return ventes.stream().map(VendreMapper::mapToVendreDto).toList();
    }


    public VendreDto createVente (VendreDto vendreDto){
        int anneeMax = this.tickeRepository.findAllAnnee().stream().max(Integer::compare).get();
        if (vendreDto.getAnnee()==anneeMax){
        int numMax  =this.tickeRepository.findLastNumTicketByAnneeOrderByNumTicketAsc(anneeMax);
        vendreDto.setNumTicket(numMax+1);}
        else{vendreDto.setNumTicket(1);}
        Ticket ticketToSave = new Ticket(vendreDto.getAnnee(),vendreDto.getNumTicket(), String.valueOf(LocalDate.now()), String.valueOf(LocalDateTime.now().getHour()));
        Ticket ticketsaved = this.tickeRepository.save(ticketToSave);
        Article articleToSave = this.articleRepository.findByNomArticleAndVolume(vendreDto.getNomArticle(),vendreDto.getVolume());
        Vendre venteToSave=new Vendre(ticketsaved,articleToSave,vendreDto.getQuantite(),vendreDto.getPrixVente());
        Vendre savedVendre = this.vendreRepository.save(venteToSave);
        System.out.println("ok");
        return VendreMapper.mapToVendreDto(savedVendre);
    }
}
