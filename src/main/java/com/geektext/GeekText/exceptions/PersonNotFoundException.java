package com.geektext.GeekText.exceptions;

public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException(String username) {
        super("Could not find person " + username);
    }
}