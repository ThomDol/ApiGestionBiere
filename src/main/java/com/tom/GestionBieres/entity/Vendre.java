package com.tom.GestionBieres.entity;

import com.tom.GestionBieres.entity.KeyComposite.VendreId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(VendreId.class)
public class Vendre implements Serializable {
    @Id
    @NonNull
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="ANNEE",referencedColumnName="ANNEE"),
            @JoinColumn(name="NUMERO_TICKET",referencedColumnName="NUMERO_TICKET")
    })
    private Ticket ticket;

    @Id
    @NonNull
    @ManyToOne
    @JoinColumn(name="ID_ARTICLE",referencedColumnName="ID_ARTICLE")
    private Article article;

    @Column(name="QUANTITE")
    private int quantite;

    @Column(name="PRIX_VENTE")
    private float prixVente;
}
