package com.geektext.GeekText.exceptions;

public class CreditCardNotFoundException extends RuntimeException{

    public CreditCardNotFoundException(String cardNumber) {
        super("Could not find Credit Card with number " + cardNumber);
    }
}
