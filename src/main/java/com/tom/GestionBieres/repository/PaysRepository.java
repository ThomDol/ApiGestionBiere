package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaysRepository extends JpaRepository<Pays,Long> {
}
