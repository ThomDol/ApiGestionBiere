package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Typebiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeBiereRepository extends JpaRepository<Typebiere,Long> {
}
