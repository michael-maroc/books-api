package com.michael.crudapplication.repository;

import com.michael.crudapplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
