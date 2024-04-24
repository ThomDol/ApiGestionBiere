package com.tom.GestionBieres.entity.KeyComposite;

import com.tom.GestionBieres.entity.Article;
import com.tom.GestionBieres.entity.Ticket;

import java.io.Serializable;

public class VendreId implements Serializable {
    private Ticket ticket;
    private Article article;

}
