package com.michael.crudapplication.service;

import com.michael.crudapplication.model.Book;
import com.michael.crudapplication.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        ArrayList<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(book -> {
            books.add(book);
        });
        return books;
    }
}
