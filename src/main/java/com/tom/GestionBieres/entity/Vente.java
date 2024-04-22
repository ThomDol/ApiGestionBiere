package com.tom.GestionBieres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vente {
    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="ANNEE",referencedColumnName="ANNEE"),
            @JoinColumn(name="NUMERO_TICKET",referencedColumnName="NUMERO_TICKET")
    })
    private Ticket ticket;

    @Id
    @ManyToOne
    @JoinColumn(name="ID_ARTICLE",referencedColumnName="ID_ARTICLE")
    private Article article;

    @Column(name="QUANTITE")
    private int quantite;

    @Column(name="PRIX_VENTE")
    private float prixVente;
}
