package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {
}
