package com.tom.GestionBieres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    @Column(name="ID_ARTICLE")
    private Long idArticle;

    @Column(name="NOM_ARTICLE")
    @NonNull
    private String  nomArticle;

    @Column(name="PRIX_ACHAT")
    private float prixAchat;

    @Column(name="VOLUME")
    private int volume;

    @Column(name="TITRAGE")
    private float titrage;

    @ManyToOne
    @NonNull
    @JoinColumn(name="ID_MARQUE",referencedColumnName="ID_MARQUE")
    private Marque marque;

    @ManyToOne
    @JoinColumn(name="ID_COULEUR",referencedColumnName="ID_COULEUR")
    private Couleur couleur;

    @ManyToOne
    @JoinColumn(name="ID_TYPE",referencedColumnName="ID_TYPE")
    private Typebiere type;
}
