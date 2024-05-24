package com.tom.GestionBieres.Service;


import com.tom.GestionBieres.entityDto.ArticleDto;

import java.util.List;

public interface ArticleService {
    List<ArticleDto> findAll();

    ArticleDto loadByNameAndVolume(String name, int volume);
    List<ArticleDto> getAllArticleByMarque (Long idMarque);
}
