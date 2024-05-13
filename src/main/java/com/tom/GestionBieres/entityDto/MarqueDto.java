package com.tom.GestionBieres.entityDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarqueDto {
    private long idMarque;


    private String nomMarque;
    private String paysOrigine;
    private String fabricant;
}
