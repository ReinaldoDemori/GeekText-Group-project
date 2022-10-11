package com.geektext.GeekText.entities;

import javax.persistence.*;
import java.util.LinkedList;

@Entity
public class Person {
 
    @Id
    private String username;
    private String password;
    private String name;
    private String address;
    private CreditCard creditCard;
    @OneToMany(fetch = FetchType.LAZY)
    private LinkedList<CreditCard> creditCards;

    public Person(String username, String password, String name, String address){

        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;

    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the credit card
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * @param creditCard the credit card to set
     */
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public LinkedList<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void addCreditCards(CreditCard card) {
        creditCards.add(card);
    }

    public void removeCreditCards(CreditCard card){
        creditCards.remove(card);
    }
}