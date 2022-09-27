package com.geektext.GeekText.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Author implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer authorID;
    
    private String aFName;
    
    private String aLName;
    
    private String bio;
    
    private String aPublisher;

    public Author() {
    }

    public Author(Integer authorID, String aFName, String aLName, String bio, String aPublisher) {
        this.authorID = authorID;
        this.aFName = aFName;
        this.aLName = aLName;
        this.bio = bio;
        this.aPublisher = aPublisher;
    }

    public Integer getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Integer authorID) {
        this.authorID = authorID;
    }

    public String getAFName() {
        return aFName;
    }

    public void setAFName(String aFName) {
        this.aFName = aFName;
    }

    public String getALName() {
        return aLName;
    }

    public void setALName(String aLName) {
        this.aLName = aLName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAPublisher() {
        return aPublisher;
    }

    public void setAPublisher(String aPublisher) {
        this.aPublisher = aPublisher;
    }

    
    
}
