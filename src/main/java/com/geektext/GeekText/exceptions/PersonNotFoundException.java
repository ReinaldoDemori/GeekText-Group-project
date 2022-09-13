package com.geektext.GeekText.exceptions;

public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException(Long id) {
        super("Could not find person " + id);
    }
}