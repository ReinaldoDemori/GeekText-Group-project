package com.geektext.GeekText.controllers;

import java.util.List;

import com.geektext.GeekText.entities.CreditCard;
import com.geektext.GeekText.repositories.CreditCardRepository;
import com.geektext.GeekText.exceptions.CreditCardNotFoundException;

import org.springframework.web.bind.annotation.*;

@RestController
public class CreditCardController {

    private CreditCardRepository repository;

    CreditCardController(CreditCardRepository repository){
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
                .orElseThrow(() -> new CreditCardNotFoundException(creditnumber)); //need to create exception file
    }

    @PutMapping("/users/{creditnumber}")
    CreditCard replaceCreditNumber(@RequestBody CreditCard newCard, @PathVariable String creditNumber) {

        return repository.findById(creditNumber)
                .map(creditCard -> {
                    creditCard.setUsername(newCard.getUsername());
                    return repository.save(newCard);
                })
                .orElseGet(() -> {

                    newCard.setCreditNumber(creditNumber);
                    return repository.save(newCard);
                });
    }

    @DeleteMapping("/persons/{id}")
    void deleteCreditCard(@PathVariable String username) {
        repository.deleteById(username);
    }

    @GetMapping("/creditcards/user/{username}")
    List<CreditCard> findByUsername(@PathVariable String username){
        return repository.findByUsername(username);
    }



}
