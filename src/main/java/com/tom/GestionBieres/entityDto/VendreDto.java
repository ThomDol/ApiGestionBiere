package com.tom.GestionBieres.entityDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendreDto {
    private int annee;
    private int numTicket;
    private String nomArticle;
    private int volume;
    private int quantite;
    private float prixVente;
}
