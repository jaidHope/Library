package com.example.Library;

import com.example.Library.domain.Book;
import com.example.Library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    private final BookService bookService;

    @Autowired
    public LibraryController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public ResponseEntity<byte[]> getIndexHtml() {
        try {
            // Load the index.html file as a resource
            Resource resource = new ClassPathResource("static/index.html");
            byte[] htmlBytes = resource.getInputStream().readAllBytes();

            // Set the content type to text/html
            return ResponseEntity.ok()
                    .contentType(MediaType.TEXT_HTML)
                    .body(htmlBytes);
        } catch (Exception e) {
            // Handle errors (e.g., file not found)
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getAll();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Integer id) {
        return bookService.getById(id);

    }

    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        bookService.save(book);
        return ResponseEntity.status(HttpStatus.CREATED).body("Book created successfully");
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable Integer id, @RequestBody Book updatedBook) {
        bookService.updateBook(id, updatedBook.getDescription());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer id) {
        bookService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }


}