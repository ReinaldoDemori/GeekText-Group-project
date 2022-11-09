package com.geektext.GeekText.entities;
 
import java.sql.Date;

import javax.persistence.*;

@Entity
public class ShoppingCartItems {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shoppingCartItemId;

    @ManyToOne(targetEntity = ShoppingCart.class)
    @JoinColumn(name = "shoppingCartId")
    private ShoppingCart shoppingCartId;

    @OneToOne(targetEntity = Book.class)
    @JoinColumn(name = "isbn")
    private Book isbn;

    public Integer getShoppingCartItemId(){
        return shoppingCartItemId;
    }

    public void setShoppingCartItemId(Integer id){
        this.shoppingCartItemId = id;
    }

    public ShoppingCart getShoppingCartId(){
        return shoppingCartId;
    }

    public void setShoppingCartId(ShoppingCart id){
        this.shoppingCartId = id;
    }

    public Book getBookISBN(){
        return isbn;
    }

    public void setBookISBN(Book isbn){
        this.isbn = isbn;
    }

}