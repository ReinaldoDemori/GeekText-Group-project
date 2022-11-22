package com.geektext.GeekText.controllers;

import java.util.List;
import com.geektext.GeekText.entities.Book;
import com.geektext.GeekText.exceptions.BookNotFoundException;
import com.geektext.GeekText.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    private final BookRepository repository;

    BookController(BookRepository repository){
        this.repository = repository;
    }
    
    // View All Books
    @GetMapping("/books")
    List<Book> all() {
      return repository.findAll();
    }
    
    // Create Book {Must include information of Author in AuthorID}
    @PostMapping("/books")
    Book newBook(@RequestBody Book newBook) {
      return repository.save(newBook);
    }

    //Retrieve Single Book based on ISBN
    @GetMapping("/books/{isbn}")
    Book one(@PathVariable String isbn) {

      return repository.findById(isbn)
        .orElseThrow(() -> new BookNotFoundException(isbn)); //need to create exception file
    }
    
    //Retrieve Book(s) based on AuthorID
    @GetMapping("/books/author/{authorId}")
    List<Book> findbyAuthorID(@PathVariable int authorId) {
        if(repository.findByAuthorID(authorId).isEmpty()){
            throw new BookNotFoundException(authorId);
        }
        return repository.findByAuthorID(authorId);
    }
    
}
