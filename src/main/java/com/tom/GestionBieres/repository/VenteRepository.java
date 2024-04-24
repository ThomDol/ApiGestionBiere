package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface VenteRepository extends JpaRepository<Vente, Serializable> {
}
