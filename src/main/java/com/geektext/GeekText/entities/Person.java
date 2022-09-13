package com.geektext.GeekText.entities;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
public class Person {
 
    @Id
    @GeneratedValue
    private Long id;
 
    private String name;
 
    private String message;
 
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
 
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
     * @return the message
     */
    public String getMessage() {
        return message;
    }
 
    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
 
}