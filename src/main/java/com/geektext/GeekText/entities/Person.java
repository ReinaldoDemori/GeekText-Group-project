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


    public Person() {
    }

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


}