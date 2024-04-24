package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.TypeBiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeBiereRepository extends JpaRepository<TypeBiere,Long> {
}
