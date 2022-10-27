package com.geektext.GeekText.entities;
 
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShoppingCartItems {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shoppingCartItemId;

    private Integer shoppingCartId;

    private Integer bookISBN;

    //private Date creationDate;

    public Integer getShoppingCartItemId(){
        return shoppingCartItemId;
    }

    public void setShoppingCartItemId(Integer id){
        this.shoppingCartItemId = id;
    }

    public Integer getShoppingCartId(){
        return shoppingCartId;
    }

    public void setShoppingCartId(Integer id){
        this.shoppingCartId = id;
    }

    public Integer getBookISBN(){
        return bookISBN;
    }

    public void setBookISBN(Integer bookISBN){
        this.bookISBN = bookISBN;
    }

    /*public Date getCreationDate(){
        return creationDate;
    }*/

}