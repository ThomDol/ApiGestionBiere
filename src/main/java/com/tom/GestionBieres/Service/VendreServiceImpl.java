package com.tom.GestionBieres.Service;

import com.tom.GestionBieres.Mapper.VendreMapper;
import com.tom.GestionBieres.entity.Article;
import com.tom.GestionBieres.entity.Ticket;
import com.tom.GestionBieres.entity.Vendre;
import com.tom.GestionBieres.entityDto.VendreDto;
import com.tom.GestionBieres.repository.ArticleRepository;
import com.tom.GestionBieres.repository.TicketRepository;
import com.tom.GestionBieres.repository.VendreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VendreServiceImpl implements GestionBiereService<VendreDto>{
    private VendreRepository vendreRepository;
    private TicketRepository tickeRepository;
    private ArticleRepository articleRepository;

    @Override
    public List<VendreDto> findAll() {
        List<Vendre> ventes=this.vendreRepository.findAll();
        return ventes.stream().map(vente->
                VendreMapper.mapToVendreDto(vente)).collect(Collectors.toList());
    }

    public List<VendreDto> findByAnnee (int annee){
        List<Vendre> ventes = this.vendreRepository.findAll();
        return ventes.stream().filter(vente->vente.getTicket().getAnnee()==annee).map(vente->VendreMapper.mapToVendreDto(vente)).collect(Collectors.toList());
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
        return ventes.stream().map(vente->VendreMapper.mapToVendreDto(vente)).collect(Collectors.toList());
    }
}
