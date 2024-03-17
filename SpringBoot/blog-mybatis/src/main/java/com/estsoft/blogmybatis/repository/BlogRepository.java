package com.estsoft.blogmybatis.repository;

import com.estsoft.blogmybatis.domain.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogRepository {
    private final ArticleMapper articleMapper;

    public BlogRepository(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    public List<Article> selectAllArticles() {
        return articleMapper.selectAllArticles();
    }
}
