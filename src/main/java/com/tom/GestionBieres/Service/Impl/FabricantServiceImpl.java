package com.tom.GestionBieres.Service.Impl;

import com.tom.GestionBieres.Mapper.FabricantMapper;
import com.tom.GestionBieres.Service.FabricantService;
import com.tom.GestionBieres.entity.Fabricant;
import com.tom.GestionBieres.entityDto.FabricantDto;
import com.tom.GestionBieres.repository.FabricantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FabricantServiceImpl implements FabricantService {

    private FabricantRepository fabricantRepository;


    @Override
    public List<FabricantDto> findAll() {
        List<Fabricant> fabricants = this.fabricantRepository.findAll();
        return fabricants.stream().map(FabricantMapper::mapToFabricantDto).toList();
    }
}
