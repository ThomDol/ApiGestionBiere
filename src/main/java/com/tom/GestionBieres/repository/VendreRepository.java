package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Article;
import com.tom.GestionBieres.entity.Ticket;
import com.tom.GestionBieres.entity.Vendre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface VendreRepository extends JpaRepository<Vendre, Serializable> {
    Vendre findByArticle(Article article);
}
