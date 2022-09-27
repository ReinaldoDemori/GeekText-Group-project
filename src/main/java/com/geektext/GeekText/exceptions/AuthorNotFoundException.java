package com.geektext.GeekText.exceptions;


public class AuthorNotFoundException extends RuntimeException{
    
    public AuthorNotFoundException(Integer author_id){
        super("Could not find author " + author_id);
    }
    
}
