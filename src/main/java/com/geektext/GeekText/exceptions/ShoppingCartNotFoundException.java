package com.geektext.GeekText.exceptions;

public class ShoppingCartNotFoundException extends RuntimeException {

    public ShoppingCartNotFoundException(Integer id) {
        super("Could not find shopping cart " + id);
    }
}