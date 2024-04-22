package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
