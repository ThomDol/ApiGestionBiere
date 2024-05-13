package com.tom.GestionBieres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Continent {
    @Id
    @Column(name="ID_CONTINENT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContinent;

    @Column(name="NOM_CONTINENT")
    private String nomContinent;
}
