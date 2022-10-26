package com.geektext.GeekText.controllers;

import java.util.List;

import com.geektext.GeekText.repositories.ShoppingCartRepository;
import com.geektext.GeekText.entities.ShoppingCart;
import com.geektext.GeekText.exceptions.ShoppingCartNotFoundException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ShoppingCartController{

    private final ShoppingCartRepository repository;

    ShoppingCartController(ShoppingCartRepository repository){
        this.repository = repository;
    }

    //Get all shopping carts
    @GetMapping("/shoppingcarts")
    List<ShoppingCart> all(){
        return repository.findAll();
    }

    //Create a new shopping cart
    @PostMapping("/shoppingcarts")
    ShoppingCart newShoppingCart(@RequestBody ShoppingCart newShoppingCart){
        return repository.save(newShoppingCart);
    }

    //Get a shopping cart by it's ID
    @GetMapping("/shoppingcarts/{shoppingCartId}")
    ShoppingCart one(@PathVariable Integer shoppingCartId){

        return repository.findById(shoppingCartId)
        .orElseThrow(() -> new ShoppingCartNotFoundException(shoppingCartId));
        
    }

    //Replace shopping cart
    @PutMapping("/shoppingcarts/{shoppingCartId}")
    ShoppingCart replaceShoppingCart(@RequestBody ShoppingCart newShoppingCart, @PathVariable Integer shoppingCartId){

        return repository.findById(shoppingCartId)
            .map(shoppingCart -> {
                shoppingCart.setUserId(newShoppingCart.getUserId());
                return repository.save(shoppingCart);
            })
            .orElseGet(() ->{
                return repository.save(newShoppingCart);
            });
    }

    //delete a shoppig cart by it's ID
    @DeleteMapping("/shoppingcarts/{shoppingCardId}")
    void deleteShoppingCart(@PathVariable Integer shoppingCartId){
        repository.deleteById(shoppingCartId);
    }
    

}