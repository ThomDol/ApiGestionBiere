package com.tom.GestionBieres.Service;

import com.tom.GestionBieres.entityDto.MarqueDto;

import java.util.List;

public interface MarqueService {
    List<MarqueDto> findAll();
}
