package com.geektext.GeekText.entities;

import javax.persistence.*;

@Entity
public class CreditCard {

    @Id
    private String creditNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username")
    private Person owner;
    private String expDate;
    private int secCode;

    public CreditCard() {
    }

    public CreditCard(String creditNumber, Person owner, String expDate, int secCode){
        this.creditNumber = creditNumber;
        this.owner = owner;
        this.expDate = expDate;
        this.secCode = secCode;
    }

    /**
     * @return the owner
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * @return the credit number
     */
    public String getCreditNumber() {
        return creditNumber;
    }

    /**
     * @param creditNumber the credit number to set
     */
    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
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
