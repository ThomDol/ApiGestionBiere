package com.tom.GestionBieres.Mapper;

import com.tom.GestionBieres.entity.Continent;
import com.tom.GestionBieres.entityDto.ContinentDto;

public class ContinentMapper {
    public static ContinentDto mapToContinentDto(Continent continent){
        return new ContinentDto(
                continent.getIdContinent(),
                continent.getNomContinent()
        );
    }

    public static Continent mapToContinent (ContinentDto continentDto){
        return new Continent(
                continentDto.getIdContinent(),
                continentDto.getNomContinent()
        );
    }
}
