package com.tom.GestionBieres.Mapper;

import com.tom.GestionBieres.entity.Vendre;
import com.tom.GestionBieres.entityDto.VendreDto;
import com.tom.GestionBieres.repository.ArticleRepository;
import com.tom.GestionBieres.repository.TicketRepository;
import lombok.AllArgsConstructor;


public class VendreMapper {

    private static TicketRepository ticketRepository;
    private static ArticleRepository articleRepository;
    public static VendreDto mapToVendreDto (Vendre vendre){
        return new VendreDto(
                vendre.getTicket().getAnnee(),
                vendre.getTicket().getNumTicket(),
                vendre.getArticle().getNomArticle(),
                vendre.getQuantite(),
                vendre.getPrixVente()
        );
    }

    public static Vendre mapToVendre (VendreDto vendreDto){
        return new Vendre(
        ticketRepository.findByAnneeAndNumTicket(vendreDto.getAnnee(), vendreDto.getNumTicket()),
        articleRepository.findByNomArticle(vendreDto.getNomArticle()),
        vendreDto.getQuantite(),
        vendreDto.getPrixVente());


    }
}

