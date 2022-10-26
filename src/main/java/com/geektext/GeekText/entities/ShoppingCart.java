package com.geektext.GeekText.entities;
 
import java.sql.Date;

import javax.persistence.*;

@Entity
public class ShoppingCart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shoppingCartId;

    private Integer userId;

    //private Date creationDate;

    public Integer getShoppingCartId(){
        return shoppingCartId;
    }

    public void setShoppingCartId(Integer id){
        this.shoppingCartId = id;
    }

    public Integer getUserId(){
        return userId;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    /*public Date getCreationDate(){
        return creationDate;
    }*/

}