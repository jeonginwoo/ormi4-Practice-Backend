package com.estsoft.blogjpa.dto;

import com.estsoft.blogjpa.model.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommentRequest {
    private String body;

    public Comment toEntity(Long article_id) {
        return new Comment(article_id, body);
    }
}
