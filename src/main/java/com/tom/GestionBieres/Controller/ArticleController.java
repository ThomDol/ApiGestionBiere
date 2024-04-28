package com.tom.GestionBieres.Controller;

import com.tom.GestionBieres.Service.ArticleServiceImpl;
import com.tom.GestionBieres.Service.GestionBiereService;
import com.tom.GestionBieres.entityDto.ArticleDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path="/biere")
@CrossOrigin(origins = "*")
public class ArticleController {

    private ArticleServiceImpl articleService;

    @GetMapping(path="/articles")
    @ResponseStatus(HttpStatus.OK)
    public List<ArticleDto> getAllArticles(){
        return this.articleService.findAll();
    }



}
