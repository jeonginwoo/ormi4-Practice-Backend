package com.estsoft.blogjpa.dto;

import com.estsoft.blogjpa.model.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticleRequest {
    private String title;
    private String content;

    public Article toEntity() {	// 생성자를 사용해 객체 생성
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}