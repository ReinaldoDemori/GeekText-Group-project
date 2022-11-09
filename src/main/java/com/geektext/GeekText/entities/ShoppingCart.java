package com.geektext.GeekText.entities;

import javax.persistence.*;

@Entity
public class ShoppingCart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shoppingCartId;

    @OneToOne(targetEntity = Person.class)
    @JoinColumn(name = "username")
    private Person username;


    public Integer getShoppingCartId(){
        return shoppingCartId;
    }

    public void setShoppingCartId(Integer id){
        this.shoppingCartId = id;
    }

    public Person getUserId(){
        return username;
    }

    public void setUserId(Person username){
        this.username = username;
    }

}