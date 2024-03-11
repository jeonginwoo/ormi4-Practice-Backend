package com.estsoft.blogmybatis.repository;

import com.estsoft.blogmybatis.domain.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    List<Article> selectAllArticles();
}
