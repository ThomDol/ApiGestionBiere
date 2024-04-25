package com.tom.GestionBieres.Service;

import com.tom.GestionBieres.Mapper.CouleurMapper;
import com.tom.GestionBieres.entity.Couleur;
import com.tom.GestionBieres.entityDto.CouleurDto;
import com.tom.GestionBieres.repository.CouleurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CouleurServiceImpl implements GestionBiereService<CouleurDto>{
    private CouleurRepository couleurRepository;
    @Override
    public List<CouleurDto> findAll() {
        List<Couleur> couleurs = this.couleurRepository.findAll();
        return couleurs.stream().map(couleur->
                CouleurMapper.mapToCouleurDto(couleur)).collect(Collectors.toList());
    }
}
