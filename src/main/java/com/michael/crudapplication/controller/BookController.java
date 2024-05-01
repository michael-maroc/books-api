package com.michael.crudapplication.controller;

import com.michael.crudapplication.model.Book;
import com.michael.crudapplication.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("")
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }
}
