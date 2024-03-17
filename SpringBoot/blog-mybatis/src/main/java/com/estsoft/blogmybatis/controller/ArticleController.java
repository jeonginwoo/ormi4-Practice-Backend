package com.estsoft.blogmybatis.controller;

import com.estsoft.blogmybatis.domain.Article;
import com.estsoft.blogmybatis.domain.ArticleResponse;
import com.estsoft.blogmybatis.service.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Controller
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    // GET
    /*@GetMapping("/api/articles")
    @ResponseBody
    public List<ArticleResponse> showAll() {
        List<Article> list = articleService.findAll();
        List<ArticleResponse> articleResponses = list.stream().map(x -> new ArticleResponse(x.getId(), x.getTitle(), x.getContent())).toList();

        return articleResponses;
    }*/
    @GetMapping("/api/articles")
    @ResponseBody
    public ResponseEntity<List<ArticleResponse>> showAll() {
        List<Article> list = articleService.findAll();
        List<ArticleResponse> articleResponses = list.stream().map(x -> new ArticleResponse(x.getId(), x.getTitle(), x.getContent())).toList();

        return ResponseEntity.status(HttpStatus.OK).body(articleResponses);
        // return ResponseEntity.ok(articleResponses);
    }
}
