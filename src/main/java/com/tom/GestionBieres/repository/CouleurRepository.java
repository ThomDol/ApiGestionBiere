package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Couleur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouleurRepository  extends JpaRepository <Couleur,Long> {
}
