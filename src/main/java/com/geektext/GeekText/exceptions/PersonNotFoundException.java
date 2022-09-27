package com.geektext.GeekText.exceptions;

public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException(Integer id) {
        super("Could not find person " + id);
    }
}