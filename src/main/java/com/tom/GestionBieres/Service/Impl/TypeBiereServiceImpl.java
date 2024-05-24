package com.tom.GestionBieres.Service.Impl;

import com.tom.GestionBieres.Mapper.TypeBiereMapper;
import com.tom.GestionBieres.Service.TypeBiereService;
import com.tom.GestionBieres.entity.Typebiere;
import com.tom.GestionBieres.entityDto.TypebiereDto;
import com.tom.GestionBieres.repository.TypeBiereRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeBiereServiceImpl implements TypeBiereService {

    private TypeBiereRepository typeBiereRepository;


    @Override
    public List<TypebiereDto> findAll() {
        List<Typebiere> types = this.typeBiereRepository.findAll();
        return types.stream().map(TypeBiereMapper::mapToTypeBiereDto).toList();
    }
}
