package com.example.Library.repository;

import com.example.Library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository class for the book database table.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    public Book getById(Integer id);
    public Book save(Book book);
    public List<Book> findAll();

}
