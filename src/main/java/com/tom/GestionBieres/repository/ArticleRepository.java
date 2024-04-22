package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
