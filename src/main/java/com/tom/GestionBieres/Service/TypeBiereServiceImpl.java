package com.tom.GestionBieres.Service;

import com.tom.GestionBieres.Mapper.TypeBiereMapper;
import com.tom.GestionBieres.entity.Typebiere;
import com.tom.GestionBieres.entityDto.TypebiereDto;
import com.tom.GestionBieres.repository.TypeBiereRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TypeBiereServiceImpl implements GestionBiereService<TypebiereDto>{

    private TypeBiereRepository typeBiereRepository;
    @Override
    public List<TypebiereDto> findAll() {
        List<Typebiere> types = this.typeBiereRepository.findAll();
        return types.stream().map(type->
                TypeBiereMapper.mapToTypeBiereDto(type)).collect(Collectors.toList());
    }
}
