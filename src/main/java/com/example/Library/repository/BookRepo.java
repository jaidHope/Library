package com.example.Library.repository;

import com.example.Library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository class for the book database table.
 */
@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

    public Book getByName(String name);
    public List<Book> getBooksByNameIsContainingIgnoreCase(String name);
    public boolean existsByName(String name);

}
