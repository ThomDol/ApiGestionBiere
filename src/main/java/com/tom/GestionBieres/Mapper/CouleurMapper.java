package com.tom.GestionBieres.Mapper;

import com.tom.GestionBieres.entity.Couleur;
import com.tom.GestionBieres.entityDto.CouleurDto;

public class CouleurMapper {
    public static Couleur mapToCouleur (CouleurDto couleurDto){
        return new Couleur (
                couleurDto.getIdCouleur(),
                couleurDto.getNomCouleur()
        );
    }

    public static CouleurDto mapToCouleurDto(Couleur couleur){
        return new CouleurDto (
                couleur.getIdCouleur(),
                couleur.getNomCouleur()
        );
    }
}
