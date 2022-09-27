package com.geektext.GeekText.controllers;

import java.util.List;
import com.geektext.GeekText.entities.Book;
import com.geektext.GeekText.exceptions.BookNotFoundException;
import com.geektext.GeekText.repositories.BookRepository;
import org.springframework.web.bind.annotation.*;


public class BookController {

    private final BookRepository repository;

    BookController(BookRepository repository){
        this.repository = repository;
    }
    
    @GetMapping("/books")
    List<Book> all() {
      return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/books")
    Book newBook(@RequestBody Book newBook) {
      return repository.save(newBook);
    }

    // Single item

    @GetMapping("/books/{isbn}")
    Book one(@PathVariable String isbn) {

      return repository.findById(isbn)
        .orElseThrow(() -> new BookNotFoundException(isbn)); //need to create exception file
    }

    @PutMapping("/persons/{id}")
    Book replaceBook(@RequestBody Book newBook, @PathVariable String isbn) {

      return repository.findById(isbn)
        .map(book -> {
          book.setBName(newBook.getBName());
          return repository.save(book);
        })
        .orElseGet(() -> {
          newBook.setIsbn(isbn);
          return repository.save(newBook);
        });
    }

    @DeleteMapping("/books/{id}")
    void deleteBook(@PathVariable String isbn) {
      repository.deleteById(isbn);
    }
    
}
