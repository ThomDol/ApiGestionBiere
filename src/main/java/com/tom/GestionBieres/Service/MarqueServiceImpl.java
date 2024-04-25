package com.tom.GestionBieres.Service;

import com.tom.GestionBieres.Mapper.MarqueMapper;
import com.tom.GestionBieres.entity.Marque;
import com.tom.GestionBieres.entity.Pays;
import com.tom.GestionBieres.entityDto.MarqueDto;
import com.tom.GestionBieres.repository.MarqueRepository;
import com.tom.GestionBieres.repository.PaysRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class MarqueServiceImpl implements GestionBiereService<MarqueDto>{
    private MarqueRepository marqueRepository;

    @Override
    public List<MarqueDto> findAll() {
        List<Marque> marques= this.marqueRepository.findAll();

        return marques.stream().map(marque->
                MarqueMapper.mapToMarqueDto(marque)).collect(Collectors.toList());}




}
