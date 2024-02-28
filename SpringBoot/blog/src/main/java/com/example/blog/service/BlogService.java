package com.example.blog.service;

import com.example.blog.domain.Article;
import com.example.blog.dto.AddArticleRequest;
import com.example.blog.dto.UpdateArticleRequest;
import com.example.blog.repository.BlogRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    // article 테이블에 저장되어 있는 모든 데이터 조회
    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    // 삭제 로직 추가
    public void delete(Long id) {
        blogRepository.deleteById(id);
    }

    // 글 수정 메소드
    @Transactional  // 매칭한 메소드를 하나의 트랜잭션으로 묶는 역할. 중간에 에러가 발생해도 제대로 된 값 수정 보장.
    public Article update(Long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found " + id));

        article.update(request.getTitle(), request.getContent());
        return article;
    }
}
