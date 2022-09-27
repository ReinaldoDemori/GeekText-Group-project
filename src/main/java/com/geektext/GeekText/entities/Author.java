package com.geektext.GeekText.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(catalog = "", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Author_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Author.findAll", query = "SELECT a FROM Author a"),
    @NamedQuery(name = "Author.findByAuthorID", query = "SELECT a FROM Author a WHERE a.authorID = :authorID"),
    @NamedQuery(name = "Author.findByAFName", query = "SELECT a FROM Author a WHERE a.aFName = :aFName"),
    @NamedQuery(name = "Author.findByALName", query = "SELECT a FROM Author a WHERE a.aLName = :aLName"),
    @NamedQuery(name = "Author.findByBio", query = "SELECT a FROM Author a WHERE a.bio = :bio"),
    @NamedQuery(name = "Author.findByAPublisher", query = "SELECT a FROM Author a WHERE a.aPublisher = :aPublisher")})
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long authorID;
    @Basic(optional = false)
    @Column(nullable = false, length = 2000000000)
    private String aFName;
    @Basic(optional = false)
    @Column(nullable = false, length = 2000000000)
    private String aLName;
    @Basic(optional = false)
    @Column(nullable = false, length = 2000000000)
    private String bio;
    @Basic(optional = false)
    @Column(nullable = false, length = 2000000000)
    private String aPublisher;

    public Author() {
    }

    public Author(Long authorID, String aFName, String aLName, String bio, String aPublisher) {
        this.authorID = authorID;
        this.aFName = aFName;
        this.aLName = aLName;
        this.bio = bio;
        this.aPublisher = aPublisher;
    }

    public Long getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Long authorID) {
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
