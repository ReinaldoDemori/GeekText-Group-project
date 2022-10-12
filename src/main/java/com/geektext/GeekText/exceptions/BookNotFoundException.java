
package com.geektext.GeekText.exceptions;


public class BookNotFoundException extends RuntimeException{
    
    public BookNotFoundException(String isbn){
        super("Could not find book " + isbn);
    }
}
