/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.geektext.GeekText.controllers;

import com.geektext.GeekText.repositories.AuthorRepository;
import com.geektext.GeekText.entities.Author;
import com.geektext.GeekText.exceptions.AuthorNotFoundException;
import java.util.List;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author redst
 */
public class AuthorController {
    
    private final AuthorRepository repository;

    AuthorController(AuthorRepository repository){
        this.repository = repository;
    }
    
    @GetMapping("/authors")
    List<Author> all() {
      return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/persons")
    Author newAuthor (@RequestBody Author newAuthor) {
      return repository.save(newAuthor);
    }

    // Single item

    @GetMapping("/authors/{author_id}")
    Author one(@PathVariable Integer author_id) {

      return repository.findById(author_id)
        .orElseThrow(() -> new AuthorNotFoundException(author_id)); //need to create exception file
    }

    @PutMapping("/authors/{author_id}")
    Author replaceAuthor(@RequestBody Author newAuthor, @PathVariable Integer author_id) {

      return repository.findById(author_id)
        .map(author -> {
          author.setAFName(newAuthor.getAFName());
          return repository.save(author);
        })
        .orElseGet(() -> {
          newAuthor.setAuthorID(author_id);
          return repository.save(newAuthor);
        });
    }

    @DeleteMapping("/persons/{id}")
    void deleteAuthor(@PathVariable Integer author_id) {
      repository.deleteById(author_id);
    }

}
