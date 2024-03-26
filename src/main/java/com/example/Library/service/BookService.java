package com.example.Library.service;
import com.example.Library.domain.Book;
import com.example.Library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(String name, String author) {
        return bookRepository.addBook(name, author);
    }

    public Book updateBook(Integer id)
    {
        return bookRepository.updateBook(id);
    }

    public void deleteBook(Integer id)
    {
        bookRepository.deleteBook(id);
    }

    public void save(Book book) {
        bookRepository.save(book);
    }

    public Book getById(Integer id) {
        return bookRepository.getById(id);
    }

    public List<Book> getAll() {
        return bookRepository.getAll();
    }
}
