package com.michael.crudapplication.controller;

import com.michael.crudapplication.model.Book;
import com.michael.crudapplication.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("{id}")
    public Optional<Book> getOneBook(@PathVariable int id) {
        return bookService.getOneBook(id);
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("")
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("{id}")
    public void updateBook(@RequestBody Book book, @PathVariable int id) {
        bookService.updateBook(book, id);
    }
}
