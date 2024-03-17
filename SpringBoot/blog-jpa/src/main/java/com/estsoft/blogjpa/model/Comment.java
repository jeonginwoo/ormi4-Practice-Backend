package com.estsoft.blogjpa.model;

import com.estsoft.blogjpa.dto.CommentResponse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "article_id", nullable = false)
    private Long articleId;

    @Column(name = "body", nullable = false)
    private String body;

    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Comment(Long articleId, String body) {
        this.articleId = articleId;
        this.body = body;
    }

    public CommentResponse toResponse() {
        return new CommentResponse(id, body, createdAt);
    }

    public boolean compareArticleId(Long article_id) {
        return this.articleId.equals(article_id);
    }
}
