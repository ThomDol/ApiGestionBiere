package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarqueRepository extends JpaRepository <Marque,Long>{
}
