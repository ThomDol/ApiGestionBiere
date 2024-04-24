package com.tom.GestionBieres.Mapper;

import com.tom.GestionBieres.entity.Article;
import com.tom.GestionBieres.entity.Couleur;
import com.tom.GestionBieres.entity.Marque;
import com.tom.GestionBieres.entity.Typebiere;
import com.tom.GestionBieres.entityDto.ArticleDto;

public class ArticleMapper {
    public static ArticleDto mapToArticleDto(Article article){
        return new ArticleDto(
                article.getIdArticle(),
                article.getNomArticle(),
                article.getPrixAchat(),
                article.getVolume(),
                article.getTitrage()
        );
    }

    public static Article mapToArticle (ArticleDto articleDto, Marque marque, Couleur couleur, Typebiere type){
        return new Article(
                articleDto.getIdArticle(),
                articleDto.getNomArticle(),
                articleDto.getPrixAchat(),
                articleDto.getVolume(),
                articleDto.getTitrage(),
                marque,
                couleur,
                type
        );
    }
}
