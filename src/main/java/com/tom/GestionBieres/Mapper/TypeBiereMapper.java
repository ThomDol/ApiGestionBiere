package com.tom.GestionBieres.Mapper;

import com.tom.GestionBieres.entity.Typebiere;
import com.tom.GestionBieres.entityDto.TypebiereDto;

public class TypeBiereMapper {
    public static Typebiere mapToTypeBiere (TypebiereDto typebiereDto){
        return new Typebiere(
                typebiereDto.getIdType(),
                typebiereDto.getNomType()
        );
    }

    public static TypebiereDto mapToTypeBiereDto (Typebiere typebiere){
        return new TypebiereDto (
                typebiere.getIdType(),
                typebiere.getNomType()
        );
    }
}
