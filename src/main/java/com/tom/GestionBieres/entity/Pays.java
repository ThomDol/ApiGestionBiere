package com.tom.GestionBieres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAYS")
    private Long idPays;

    @Column(name="NOM_PAYS")
    private String nomPays;

    @ManyToOne
    @JoinColumn(name="ID_CONTINENT",nullable = false)
    private Continent continent;
}
