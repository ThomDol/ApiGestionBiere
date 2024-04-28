package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {
    Article findByNomArticleAndVolume(String nomArticle, int volume);
}
