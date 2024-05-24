package com.tom.GestionBieres.Service.Impl;

import com.tom.GestionBieres.Mapper.ContinentMapper;
import com.tom.GestionBieres.Service.ContinentService;
import com.tom.GestionBieres.entity.Continent;
import com.tom.GestionBieres.entityDto.ContinentDto;
import com.tom.GestionBieres.repository.ContinentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContinentServiceImpl implements ContinentService {

    private ContinentRepository continentRepository;



    @Override
    public List<ContinentDto> findAll() {
        List<Continent> continents =this.continentRepository.findAll();
        return continents.stream().map(ContinentMapper::mapToContinentDto).toList();
    }
}
