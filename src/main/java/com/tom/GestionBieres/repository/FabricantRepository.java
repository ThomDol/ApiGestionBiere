package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Fabricant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricantRepository extends JpaRepository<Fabricant,Long> {
}
