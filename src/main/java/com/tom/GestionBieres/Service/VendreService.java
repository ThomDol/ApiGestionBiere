package com.tom.GestionBieres.Service;

import com.tom.GestionBieres.entityDto.VendreDto;

import java.util.List;

public interface VendreService {
    List<VendreDto> findAll();
    List<VendreDto> findByAnnee (int annee);
    List<VendreDto> findByAnneeAndByArticleNameAndVolume (int annee, String nomArticle,int volume);
    List<VendreDto> findByArticleNameAndVolume (String nomArticle,int volume);
    VendreDto createVente (VendreDto vendreDto);
}
