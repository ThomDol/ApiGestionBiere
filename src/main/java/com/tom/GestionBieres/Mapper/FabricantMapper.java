package com.tom.GestionBieres.Mapper;

import com.tom.GestionBieres.entity.Fabricant;
import com.tom.GestionBieres.entityDto.FabricantDto;

public class FabricantMapper {
    public static Fabricant mapToFabricant (FabricantDto fabricantDto){
        return new Fabricant(
                fabricantDto.getIdFabricant(),
                fabricantDto.getNomFabricant()
        );
    }

    public static FabricantDto mapToFabricantDto (Fabricant fabricant){
        return new FabricantDto(
                fabricant.getIdFabricant(),
                fabricant.getNomFabricant()
        );
    }
}
