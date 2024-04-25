package com.tom.GestionBieres.Service;

import com.tom.GestionBieres.Mapper.VendreMapper;
import com.tom.GestionBieres.entity.Vendre;
import com.tom.GestionBieres.entityDto.VendreDto;
import com.tom.GestionBieres.repository.VendreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VendreServiceImpl implements GestionBiereService<VendreDto>{
    private VendreRepository vendreRepository;

    @Override
    public List<VendreDto> findAll() {
        List<Vendre> ventes=this.vendreRepository.findAll();
        return ventes.stream().map(vente->
                VendreMapper.mapToVendreDto(vente)).collect(Collectors.toList());
    }

    public List<VendreDto> findByAnnee (int annee){
        List<Vendre> ventes = this.vendreRepository.findAll();
        return ventes.stream().filter(vente->vente.getTicket().getAnnee()==annee).map(vente->VendreMapper.mapToVendreDto(vente)).collect(Collectors.toList());
    }

    public List<VendreDto> findByAnneeAndByArticleName (int annee, String nomArticle){
        List<Vendre> ventes = this.vendreRepository.findAll();
        return ventes.stream()
                .filter(vente->vente.getTicket().getAnnee()==annee && vente.getArticle().getNomArticle().equals(nomArticle))
                .map(vente->VendreMapper.mapToVendreDto(vente)).collect(Collectors.toList());
    }
}
