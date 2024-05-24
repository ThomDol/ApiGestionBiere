package com.tom.GestionBieres.Service;

import com.tom.GestionBieres.entityDto.FabricantDto;

import java.util.List;

public interface FabricantService {
    List<FabricantDto> findAll();
}
