package com.estsoft.blogmybatis.domain;

import lombok.Getter;
import lombok.Setter;

// POJO (=Plain Object Java Object)
// SQL query로 받은 결과값 저장
@Getter
@Setter
public class Article {
    private Long id;
    private String title;
    private String content;
}
