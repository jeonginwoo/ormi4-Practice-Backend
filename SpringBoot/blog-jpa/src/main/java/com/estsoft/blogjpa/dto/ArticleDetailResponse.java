package com.estsoft.blogjpa.dto;

import com.estsoft.blogjpa.model.Article;
import com.estsoft.blogjpa.model.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class ArticleDetailResponse {
    private Long articleId;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private List<Comment> comments;

    public ArticleDetailResponse(Article article, List<Comment> comments) {
        this.articleId = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreatedAt();
        this.updateAt = article.getUpdateAt();
        this.comments = comments;
    }
}
