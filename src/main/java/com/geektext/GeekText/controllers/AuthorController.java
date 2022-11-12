
package com.geektext.GeekText.controllers;

import com.geektext.GeekText.repositories.AuthorRepository;
import com.geektext.GeekText.entities.Author;
import com.geektext.GeekText.exceptions.AuthorNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorController {
    @Autowired
    private AuthorRepository repository;

    AuthorController(AuthorRepository repository){
        this.repository = repository;
    }
    
    
    // View All Authors
    @GetMapping("/authors")
    List<Author> all() {
      return repository.findAll();
    }

    // Create Author
    @PostMapping("/authors")
    Author newAuthor (@RequestBody Author newAuthor) {
      return repository.save(newAuthor);
    }

    // View Single Author
    @GetMapping("/authors/{authorID}")
    Author one(@PathVariable Integer authorID) {

      return repository.findById(authorID)
        .orElseThrow(() -> new AuthorNotFoundException(authorID));
    }

}
