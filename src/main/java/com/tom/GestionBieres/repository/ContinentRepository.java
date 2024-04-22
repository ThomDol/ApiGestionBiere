package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepository extends JpaRepository <Continent,Long> {
}
