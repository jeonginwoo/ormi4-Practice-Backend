package com.estsoft.blogjpa.repository;

import com.estsoft.blogjpa.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long>  {
    List<Comment> findByArticleId(Long articleId);
}
