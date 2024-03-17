package com.estsoft.blogjpa.service;

import com.estsoft.blogjpa.dto.CommentRequest;
import com.estsoft.blogjpa.model.Comment;
import com.estsoft.blogjpa.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment save(Long articleId, CommentRequest request) {
        return commentRepository.save(new Comment(articleId, request.getBody()));
    }

    public Comment findById(Long comment_id) {
        return commentRepository.findById(comment_id).orElseThrow(() -> new IllegalArgumentException("not found id" + comment_id));
    }

    public List<Comment> findByArticleId(Long articleId) {
        return commentRepository.findByArticleId(articleId);
    }
}
