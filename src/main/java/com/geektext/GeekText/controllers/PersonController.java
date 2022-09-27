package com.geektext.GeekText.controllers;

import java.util.List;
import com.geektext.GeekText.repositories.PersonRepository;
import com.geektext.GeekText.entities.Person;
import com.geektext.GeekText.exceptions.PersonNotFoundException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PersonController {

    private final PersonRepository repository;

    PersonController(PersonRepository repository){
        this.repository = repository;
    }

      // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/persons")
  List<Person> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/persons")
  Person newPerson(@RequestBody Person newPerson) {
    return repository.save(newPerson);
  }

  // Single item
  
  @GetMapping("/persons/{id}")
  Person one(@PathVariable Integer id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new PersonNotFoundException(id)); //need to create exception file
  }

  @PutMapping("/persons/{id}")
  Person replacePerson(@RequestBody Person newPerson, @PathVariable Integer id) {
    
    return repository.findById(id)
      .map(person -> {
        person.setName(newPerson.getName());
        return repository.save(person);
      })
      .orElseGet(() -> {
        newPerson.setId(id);
        return repository.save(newPerson);
      });
  }

  @DeleteMapping("/persons/{id}")
  void deletePerson(@PathVariable Integer id) {
    repository.deleteById(id);
  }

    
}
