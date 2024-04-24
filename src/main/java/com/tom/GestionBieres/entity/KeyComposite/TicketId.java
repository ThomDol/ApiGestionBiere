package com.tom.GestionBieres.entity.KeyComposite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketId implements Serializable {
    private int annee;
    private int numTicket;
}
