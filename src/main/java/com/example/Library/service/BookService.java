package com.example.Library.service;
import com.example.Library.repository.BookRepo;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepo bookRepo;

    //constructor injection
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    // Methods to interact with bookRepo
}
