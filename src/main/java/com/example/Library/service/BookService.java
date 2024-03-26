package com.example.Library.service;
import com.example.Library.domain.Book;
import com.example.Library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public boolean updateBook(Integer id, String description)
    {
        // Get the existing book from the database
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            Book existingBook = optionalBook.get();
            // Update the description of the existing book
            existingBook.setDescription(description);
            // Save the updated book to the database
            bookRepository.save(existingBook);
            return true;
        } else {
            // Handle case where book with given ID is not found
            return false;
        }
    }

    public void deleteById(Integer id)
    {
        bookRepository.deleteById(id);
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
