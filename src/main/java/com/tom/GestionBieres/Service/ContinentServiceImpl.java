package com.tom.GestionBieres.Service;

import com.tom.GestionBieres.Mapper.ContinentMapper;
import com.tom.GestionBieres.entity.Continent;
import com.tom.GestionBieres.entityDto.ContinentDto;
import com.tom.GestionBieres.repository.ContinentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ContinentServiceImpl implements GestionBiereService<ContinentDto>{

    private ContinentRepository continentRepository;
    @Override
    public List<ContinentDto> findAll() {
        List<Continent> continents =this.continentRepository.findAll();
        return continents.stream().map(continent->
                ContinentMapper.mapToContinentDto(continent)).collect(Collectors.toList());
    }
}
