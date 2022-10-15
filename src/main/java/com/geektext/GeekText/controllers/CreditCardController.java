package com.geektext.GeekText.controllers;

import java.util.List;

import com.geektext.GeekText.entities.CreditCard;
import com.geektext.GeekText.repositories.CreditCardRepository;
import com.geektext.GeekText.exceptions.PersonNotFoundException;

import org.springframework.web.bind.annotation.*;

public class CreditCardController {


    private CreditCardRepository repository;

    void CreditCardControllerController(CreditCardRepository repository){
        this.repository = repository;
    }

    public CreditCardController(CreditCardRepository repository) {
        this.repository = repository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/creditcards")
    List<CreditCard> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/creditcards")
    CreditCard newCard(@RequestBody CreditCard newCard) {
        return repository.save(newCard);
    }

    // Single item

    @GetMapping("/creditcards/{creditnumber}")
    CreditCard one(@PathVariable String creditnumber) {

        return repository.findById(creditnumber)
                .orElseThrow(() -> new PersonNotFoundException(creditnumber)); //need to create exception file
    }

    @PutMapping("/users/{username}")
    CreditCard replacePerson(@RequestBody CreditCard newCard, @PathVariable String creditNumber) {

        return repository.findById(creditNumber)
                .map(person -> {
                    person.setCreditNumber(newCard.getCreditNumber());
                    return repository.save(newCard);
                })
                .orElseGet(() -> {
                    //newPerson.setUsername(username);
                    return repository.save(newCard);
                });
    }

    @DeleteMapping("/persons/{id}")
    void deletePerson(@PathVariable String username) {
        repository.deleteById(username);
    }



}
