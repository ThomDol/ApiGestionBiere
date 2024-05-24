package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Article;
import com.tom.GestionBieres.entity.Ticket;
import com.tom.GestionBieres.entity.Vendre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface VendreRepository extends JpaRepository<Vendre, Serializable> {

    List<Vendre> findAllByTicketAndArticle(Ticket ticket,Article article);
    List<Vendre> findAllByArticle(Article article);
    List<Vendre> findAllByTicket(Ticket ticket);
}
