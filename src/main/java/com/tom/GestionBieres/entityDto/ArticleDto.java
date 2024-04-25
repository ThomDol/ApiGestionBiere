package com.tom.GestionBieres.entityDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {
    private int idArticle;

    private String  nomArticle;

    private float prixAchat;

    private int volume;

    private float titrage;
}
