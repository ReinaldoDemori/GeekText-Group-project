package com.geektext.GeekText.controllers;

import java.util.List;

import com.geektext.GeekText.repositories.ShoppingCartItemsRepository;
import com.geektext.GeekText.entities.ShoppingCartItems;
import com.geektext.GeekText.exceptions.ShoppingCartItemNotFoundException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartItemsController {
    
    private final ShoppingCartItemsRepository repository;

    ShoppingCartItemsController(ShoppingCartItemsRepository repository){
        this.repository = repository;
    }

    //Get items in shoppingcart
    @GetMapping("/shoppingcartitems")
    List<ShoppingCartItems> all(){
        return repository.findAll();
    }

    //Create a new shopping cart item
    @PostMapping("shoppingcartitems")
    ShoppingCartItems newShoppingCartItem(@RequestBody ShoppingCartItems newShoppingCartItem){
        return repository.save(newShoppingCartItem);
    }

    //Get a specific shopping cart item
    @GetMapping("/shoppingcartitems/{shoppingCartItemId}")
    ShoppingCartItems one(@PathVariable Integer shoppingCartItemId){
        return repository.findById(shoppingCartItemId)
        .orElseThrow(() -> new ShoppingCartItemNotFoundException(shoppingCartItemId));
    }

    //Replace a shopping cart item by it's ID
    @PutMapping("/shoppingcartitems/{shoppingCartItemId}")
    ShoppingCartItems replaceShoppingCartItems(@RequestBody ShoppingCartItems newShoppingCartItems, @PathVariable Integer shoppingCartItemId){
        
        return repository.findById(shoppingCartItemId)
            .map(shoppingCartItems -> {
                shoppingCartItems.setShoppingCartId(newShoppingCartItems.getShoppingCartId());
                shoppingCartItems.setBookISBN(newShoppingCartItems.getBookISBN());
                return repository.save(shoppingCartItems);
            })
            .orElseGet(() -> {
                return repository.save(newShoppingCartItems);
            });
    }

    //Delete a shopping Cart Item
    @DeleteMapping("/shoppingcartitems/{shoppingCartItemId}")
    void deleteShoppingCartItem(@PathVariable Integer shoppingCartItemId){
        repository.deleteById(shoppingCartItemId);
    }
}
