package com.geektext.GeekText.exceptions;

public class ShoppingCartItemNotFoundException extends RuntimeException {

    public ShoppingCartItemNotFoundException(Integer id) {
        super("Could not find shopping cart item " + id);
    }
}