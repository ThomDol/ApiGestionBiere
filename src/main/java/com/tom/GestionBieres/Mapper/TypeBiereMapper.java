package com.tom.GestionBieres.Mapper;

import com.tom.GestionBieres.entity.TypeBiere;
import com.tom.GestionBieres.entityDto.TypeBiereDto;

public class TypeBiereMapper {
    public static TypeBiere mapToTypeBiere (TypeBiereDto typeBiereDto){
        return new TypeBiere(
                typeBiereDto.getIdType(),
                typeBiereDto.getNomType()
        );
    }

    public static TypeBiereDto mapToTypeBiereDto (TypeBiere typeBiere){
        return new TypeBiereDto (
                typeBiere.getIdType(),
                typeBiere.getNomType()
        );
    }
}
