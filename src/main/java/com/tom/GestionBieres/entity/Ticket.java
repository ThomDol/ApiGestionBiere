package com.tom.GestionBieres.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @Column(name="ANNEE")
    private int annee;

    @Id
    @Column(name="NUMERO_TICKET")
    private int numTicket;

    @Column(name="DATE_VENTE")
    private String dateVente;

    @Column(name="HEURE_VENTE")
    private String heureVente;

}
