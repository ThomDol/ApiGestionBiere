package com.tom.GestionBieres.Service;

import com.tom.GestionBieres.Mapper.FabricantMapper;
import com.tom.GestionBieres.entity.Fabricant;
import com.tom.GestionBieres.entityDto.FabricantDto;
import com.tom.GestionBieres.repository.FabricantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FabricantServiceImpl implements GestionBiereService<FabricantDto>{

    private FabricantRepository fabricantRepository;
    @Override
    public List<FabricantDto> findAll() {
        List<Fabricant> fabricants = this.fabricantRepository.findAll();
        return fabricants.stream().map(fabricant->
                FabricantMapper.mapToFabricantDto(fabricant)).collect(Collectors.toList());
    }
}
