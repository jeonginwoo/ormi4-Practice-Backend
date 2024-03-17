package com.estsoft.blogjpa.controller;

import com.estsoft.blogjpa.dto.ArticleDetailResponse;
import com.estsoft.blogjpa.dto.CommentRequest;
import com.estsoft.blogjpa.dto.CommentResponse;
import com.estsoft.blogjpa.model.Article;
import com.estsoft.blogjpa.model.Comment;
import com.estsoft.blogjpa.service.BlogService;
import com.estsoft.blogjpa.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class CommentController {
    private final CommentService commentService;
    private final BlogService blogService;

    public CommentController(CommentService commentService, BlogService blogServicel) {
        this.commentService = commentService;
        this.blogService = blogServicel;
    }

    @PostMapping("/comments/{articleId}")
    public ResponseEntity<CommentResponse> addComment(
            @PathVariable Long articleId,
            @RequestBody CommentRequest request) {
        Comment comment = commentService.save(articleId, request);
        return ResponseEntity.ok(comment.toResponse());
    }

    @GetMapping("/comments/{articleId}/{commentId}")
    public ResponseEntity<CommentResponse> showComment(
            @PathVariable Long articleId,
            @PathVariable Long commentId) {
        Comment comment = commentService.findById(commentId);
        if (comment.compareArticleId(articleId)) {
            return ResponseEntity.ok(new CommentResponse(comment));
        } else {    // articleId가 다르면 null값 출력
            return ResponseEntity.ok(new CommentResponse());
        }
    }

    @GetMapping("/comments/{articleId}")
    public ResponseEntity<ArticleDetailResponse> showArticleDetail (
            @PathVariable Long articleId
    ) {
        Article article = blogService.findById(articleId);
        List<Comment> comments = commentService.findByArticleId(articleId);
        ArticleDetailResponse response = new ArticleDetailResponse(article, comments);
        return ResponseEntity.ok(response);
    }
}
