package com.estsoft.blogjpa.model;

import com.estsoft.blogjpa.dto.ArticleResponse;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // 테이블 생성
@Getter
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public ArticleResponse toResponse() {
        return ArticleResponse.builder()
                .title(title)
                .content(content)
                .build();
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}