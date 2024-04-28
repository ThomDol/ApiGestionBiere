package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Serializable> {
    List<Ticket> findAllByAnnee(int annee);
    Ticket findByAnneeAndNumTicket(int annee,int numTicket);
}
