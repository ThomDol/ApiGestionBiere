package com.tom.GestionBieres.Mapper;

import com.tom.GestionBieres.entity.Fabricant;
import com.tom.GestionBieres.entity.Marque;
import com.tom.GestionBieres.entity.Pays;
import com.tom.GestionBieres.entityDto.MarqueDto;

public class MarqueMapper {
    public static MarqueDto mapToMarqueDto (Marque marque){
        if(marque.getFabricant()!=null){
        return new MarqueDto(
                marque.getIdMarque(),
                marque.getNomMarque(),
                marque.getPays().getNomPays(),
                marque.getFabricant().getNomFabricant()
        );}
        else{
            return new MarqueDto(
                marque.getIdMarque(),
                marque.getNomMarque(),
                marque.getPays().getNomPays(),
                ""
        );}
    }

    public static Marque mapToMarque (MarqueDto marqueDto, Pays pays, Fabricant fabricant){
        return new Marque(
                marqueDto.getIdMarque(),
                marqueDto.getNomMarque(),
                pays,fabricant
        );
    }
}
