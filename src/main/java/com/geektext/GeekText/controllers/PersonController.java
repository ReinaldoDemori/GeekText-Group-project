package com.geektext.GeekText.controllers;

import java.util.List;
import com.geektext.GeekText.repositories.PersonRepository;
import com.geektext.GeekText.entities.Person;
import com.geektext.GeekText.exceptions.PersonNotFoundException;

import org.springframework.web.bind.annotation.*;

@RestController
class PersonController {

    private  PersonRepository repository;

    PersonController(PersonRepository repository){
        this.repository = repository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/users")
    List<Person> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/users")
    Person newPerson(@RequestBody Person newPerson) {
        return repository.save(newPerson);
    }

    // Single item

    @GetMapping("/users/{username}")
    Person one(@PathVariable String username) {

        return repository.findById(username)
                .orElseThrow(() -> new PersonNotFoundException(username)); //need to create exception file
    }

    @PutMapping("/users/{username}")
    Person replacePerson(@RequestBody Person newPerson, @PathVariable String username) {

        return repository.findById(username)
                .map(person -> {
                    person.setName(newPerson.getName());
                    return repository.save(person);
                })
                .orElseGet(() -> {
                    //newPerson.setUsername(username);
                    return repository.save(newPerson);
                });
    }

    @DeleteMapping("/users/{username}")
    void deletePerson(@PathVariable String username) {
        repository.deleteById(username);
    }


}
