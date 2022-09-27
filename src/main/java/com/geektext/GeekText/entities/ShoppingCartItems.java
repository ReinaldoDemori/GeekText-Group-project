package com.geektext.GeekText.entities;
 
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ShoppingCartItems {
    
    @Id
    @GeneratedValue
    private Long shoppingCartItemId;

    private Long shoppingCartId;

    private Long bookISBN;

    private Date creationDate;

    public Long getShoppingCartItemId(){
        return shoppingCartItemId;
    }

    public void setShoppingCartItemId(Long id){
        this.shoppingCartItemId = id;
    }

    public Long getShoppingCartId(){
        return shoppingCartId;
    }

    public void setShoppingCartId(Long id){
        this.shoppingCartId = id;
    }

    public Long getBookISBN(){
        return bookISBN;
    }

    public void setBookISBN(Long bookISBN){
        this.bookISBN = bookISBN;
    }

    public Date getCreationDate(){
        return creationDate;
    }

}