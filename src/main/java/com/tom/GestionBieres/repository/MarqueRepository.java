package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Marque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarqueRepository extends JpaRepository <Marque,Long>{
}
