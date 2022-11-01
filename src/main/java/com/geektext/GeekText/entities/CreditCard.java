package com.geektext.GeekText.entities;

import javax.persistence.*;

@Entity
public class CreditCard {

    @Id
    private String credit_number;

    @ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "username")
    private Person username;
    private String expDate;
    private int secCode;

    public CreditCard() {
    }

    public CreditCard(String creditNumber, Person owner, String expDate, int secCode){
        this.credit_number = creditNumber;
        this.username = owner;
        this.expDate = expDate;
        this.secCode = secCode;
    }

    /**
     * @return the username
     */
    public Person getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(Person username) {
        this.username = username;
    }

    /**
     * @return the credit number
     */
    public String getCreditNumber() {
        return credit_number;
    }

    /**
     * @param creditNumber the credit number to set
     */
    public void setCreditNumber(String creditNumber) {
        this.credit_number = creditNumber;
    }

    /**
     * @return the exp. date
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * @param expDate the exp. date to set
     */
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    /**
     * @return the security code
     */
    public int getSecCode() {
        return secCode;
    }

    /**
     * @param secCode the security code to set
     */
    public void setSecCode(int secCode) {
        this.secCode = secCode;
    }

}
