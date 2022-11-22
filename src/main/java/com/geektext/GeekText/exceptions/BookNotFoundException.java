
package com.geektext.GeekText.exceptions;


public class BookNotFoundException extends RuntimeException{
    
    public BookNotFoundException(String isbn){
        super("Could not find book " + isbn);
    }
    public BookNotFoundException(int authorid){
        super("Could not find books by author " + authorid);
    }
}
