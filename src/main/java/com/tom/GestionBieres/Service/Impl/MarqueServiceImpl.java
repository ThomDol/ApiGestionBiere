package com.tom.GestionBieres.Service.Impl;

import com.tom.GestionBieres.Mapper.MarqueMapper;
import com.tom.GestionBieres.Service.MarqueService;
import com.tom.GestionBieres.entity.Marque;
import com.tom.GestionBieres.entityDto.MarqueDto;
import com.tom.GestionBieres.repository.MarqueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class MarqueServiceImpl implements MarqueService {
    private MarqueRepository marqueRepository;

    @Override
    public List<MarqueDto> findAll() {
        List<Marque> marques= this.marqueRepository.findAll();

        return marques.stream().map(MarqueMapper::mapToMarqueDto).toList();}




}
