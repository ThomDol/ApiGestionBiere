package com.tom.GestionBieres.entity;

import com.tom.GestionBieres.entity.KeyComposite.TicketId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(TicketId.class)
public class Ticket implements Serializable {
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
