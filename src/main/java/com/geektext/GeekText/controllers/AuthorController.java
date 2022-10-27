
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
    
    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/authors")
    List<Author> all() {
      return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/authors")
    Author newAuthor (@RequestBody Author newAuthor) {
      return repository.save(newAuthor);
    }

    // Single item

    @GetMapping("/authors/{authorID}")
    Author one(@PathVariable Integer authorID) {

      return repository.findById(authorID)
        .orElseThrow(() -> new AuthorNotFoundException(authorID)); //need to create exception file
    }

    @PutMapping("/authors/{authorID}")
    Author replaceAuthor(@RequestBody Author newAuthor, @PathVariable Integer authorID) {

      return repository.findById(authorID)
        .map(author -> {
          author.setAFName(newAuthor.getAFName());
          return repository.save(author);
        })
        .orElseGet(() -> {
          newAuthor.setAuthorID(authorID);
          return repository.save(newAuthor);
        });
    }

    @DeleteMapping("/authors/{authorID}")
    void deleteAuthor(@PathVariable Integer authorID) {
      repository.deleteById(authorID);
    }

}
