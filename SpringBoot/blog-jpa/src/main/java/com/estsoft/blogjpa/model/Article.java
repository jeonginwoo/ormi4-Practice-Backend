package com.estsoft.blogjpa.model;

import com.estsoft.blogjpa.dto.ArticleResponse;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity // 테이블 생성
@Getter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)  // JPA 엔터티 이벤트를 수신하는 리스너 지정.
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @CreatedDate    // 엔터티가 자동으로 생성된 시간을 자동으로 설정
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate   // 엔터티가 마지막으로 수정된 시간을 자동으로 설정
    @Column(name = "updated_at")
    private LocalDateTime updateAt;

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