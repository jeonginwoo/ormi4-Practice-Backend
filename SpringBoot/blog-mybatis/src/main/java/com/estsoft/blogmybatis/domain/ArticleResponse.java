package com.estsoft.blogmybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArticleResponse {
    private Long id;
    private String title;
    private String content;
}
