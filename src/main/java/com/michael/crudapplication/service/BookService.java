package com.michael.crudapplication.service;

import com.michael.crudapplication.model.Book;
import com.michael.crudapplication.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public void createBook(Book book) {
        bookRepository.save(book);
    }

    public Optional<Book> getOneBook(int id) {
        return bookRepository.findById(id);
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
