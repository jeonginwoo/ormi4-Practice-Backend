package com.estsoft.blogmybatis.service;

import com.estsoft.blogmybatis.domain.Article;
import com.estsoft.blogmybatis.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    private final BlogRepository repository;

    public ArticleService(BlogRepository repository) {
        this.repository = repository;
    }

    public List<Article> findAll() {
        return repository.selectAllArticles();
    }
}
