package com.geektext.GeekText.exceptions;


public class BookRatingNotFoundException extends RuntimeException{

    public BookRatingNotFoundException(Integer commentID){
        super("Could not find comment " + commentID);
    }
}
