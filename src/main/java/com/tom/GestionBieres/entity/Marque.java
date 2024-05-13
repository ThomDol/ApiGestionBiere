package com.tom.GestionBieres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_MARQUE")
    private long idMarque;

    @Column(name="NOM_MARQUE")
    private String nomMarque;

    @ManyToOne
    @JoinColumn (name="ID_PAYS",referencedColumnName="ID_PAYS", nullable = false)
    private Pays pays;

    @ManyToOne
    @JoinColumn(name="ID_FABRICANT",referencedColumnName="ID_FABRICANT")
    private Fabricant fabricant;
}
