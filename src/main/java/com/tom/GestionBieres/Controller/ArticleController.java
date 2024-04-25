package com.tom.GestionBieres.Controller;

import com.tom.GestionBieres.Service.GestionBiereService;
import com.tom.GestionBieres.entityDto.ArticleDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path="/biere")
public class ArticleController {

    private GestionBiereService<ArticleDto> articleService;

    @GetMapping(path="/articles")
    @ResponseStatus(HttpStatus.OK)
    public List<ArticleDto> getAllArticles(){
        return this.articleService.findAll();
    }
}
