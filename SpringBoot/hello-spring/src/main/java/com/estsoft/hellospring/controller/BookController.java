package com.estsoft.hellospring.controller;

import com.estsoft.hellospring.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Bean
@Slf4j
@Controller
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    public String home(Model model) {
        List<BookDTO> bookList = bookRepository.getAllBooks();
        model.addAttribute("bookList", bookList);
        return "bookManager";
    }

    @PostMapping("/books")
    public String saveBook(@RequestParam("id") String id,
                           @RequestParam("name") String name,
                           @RequestParam("author") String author) {
        System.out.println(id + name + author);

        // todo: save
        bookRepository.addBook(new BookDTO(id, name, author));

        return "redirect:/books";   // 기존 요청 : Post 요청의 /books, 응답 : Get 요청의 /books

        // return "bookManager";
        // bookManager.html을 바로 불러오면 bookList 값이 없는 페이지를 호출하게 된다.
    }

    @GetMapping("/books/{id}")
    public String detail(Model model, @PathVariable("id") String isbn) {
//        System.out.println("isbn = " + isbn);
        log.info("isbn = " + isbn);
//        log.debug("isbn = " + isbn);
//        log.error("isbn = " + isbn);

        // todo: 화면에 보여줄 book
        BookDTO book = bookRepository.getBook(isbn);
        model.addAttribute("book", book);

        return "bookDetail";
    }
}
