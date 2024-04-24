package com.tom.GestionBieres.Mapper;

import com.tom.GestionBieres.entity.Continent;
import com.tom.GestionBieres.entity.Pays;
import com.tom.GestionBieres.entityDto.PaysDto;


public class PaysMapper {



    public static PaysDto mapToPaysDto(Pays pays) {
        return new PaysDto(
                pays.getIdPays(),
                pays.getNomPays()
        );
    }

    public static Pays mapToPays(PaysDto paysDto, Continent continent) {
        return new Pays(
                paysDto.getIdPays(),
                paysDto.getNomPays(),
                continent
        );
    }
}
