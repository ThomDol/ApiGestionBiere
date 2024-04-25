package com.tom.GestionBieres.Service;

import com.tom.GestionBieres.Mapper.ArticleMapper;
import com.tom.GestionBieres.entity.Article;
import com.tom.GestionBieres.entityDto.ArticleDto;
import com.tom.GestionBieres.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ArticleServiceImpl implements GestionBiereService<ArticleDto> {

    private ArticleRepository articleRepository;

    @Override
    public List<ArticleDto> findAll() {
        List <Article> articles = this.articleRepository.findAll();
        return articles.stream().map(article->
                ArticleMapper.mapToArticleDto(article)).collect(Collectors.toList());
    }
}
