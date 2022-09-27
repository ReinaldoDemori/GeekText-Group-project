package com.geektext.GeekText.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(catalog = "", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ISBN"}),
    @UniqueConstraint(columnNames = {"BName"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b"),
    @NamedQuery(name = "Book.findByIsbn", query = "SELECT b FROM Book b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Book.findByBName", query = "SELECT b FROM Book b WHERE b.bName = :bName"),
    @NamedQuery(name = "Book.findByBDesc", query = "SELECT b FROM Book b WHERE b.bDesc = :bDesc"),
    @NamedQuery(name = "Book.findByBPrice", query = "SELECT b FROM Book b WHERE b.bPrice = :bPrice"),
    @NamedQuery(name = "Book.findByGenre", query = "SELECT b FROM Book b WHERE b.genre = :genre"),
    @NamedQuery(name = "Book.findByPublisher", query = "SELECT b FROM Book b WHERE b.publisher = :publisher"),
    @NamedQuery(name = "Book.findByPubYear", query = "SELECT b FROM Book b WHERE b.pubYear = :pubYear"),
    @NamedQuery(name = "Book.findBySCopies", query = "SELECT b FROM Book b WHERE b.sCopies = :sCopies")})
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private String isbn;
    @Basic(optional = false)
    @Column(nullable = false, length = 2000000000)
    private String bName;
    @Basic(optional = false)
    @Column(nullable = false, length = 2000000000)
    private String bDesc;
    @Basic(optional = false)
    @Column(nullable = false)
    private double bPrice;
    @Basic(optional = false)
    @Column(nullable = false, length = 2000000000)
    private String genre;
    @Basic(optional = false)
    @Column(nullable = false, length = 2000000000)
    private String publisher;
    @Basic(optional = false)
    @Column(nullable = false, length = 2000000000)
    private String pubYear;
    @Basic(optional = false)
    @Column(nullable = false)
    private int sCopies;
    @JoinColumn(name = "Author_ID", referencedColumnName = "Author_ID", nullable = false)
    @ManyToOne(optional = false)
    private Author authorID;

    public Book() {
    }
    public Book(String isbn, String bName, String bDesc, double bPrice, String genre, String publisher, String pubYear, int sCopies) {
        this.isbn = isbn;
        this.bName = bName;
        this.bDesc = bDesc;
        this.bPrice = bPrice;
        this.genre = genre;
        this.publisher = publisher;
        this.pubYear = pubYear;
        this.sCopies = sCopies;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBName() {
        return bName;
    }

    public void setBName(String bName) {
        this.bName = bName;
    }

    public String getBDesc() {
        return bDesc;
    }

    public void setBDesc(String bDesc) {
        this.bDesc = bDesc;
    }

    public double getBPrice() {
        return bPrice;
    }

    public void setBPrice(double bPrice) {
        this.bPrice = bPrice;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPubYear() {
        return pubYear;
    }

    public void setPubYear(String pubYear) {
        this.pubYear = pubYear;
    }

    public int getSCopies() {
        return sCopies;
    }

    public void setSCopies(int sCopies) {
        this.sCopies = sCopies;
    }

    public Author getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Author authorID) {
        this.authorID = authorID;
    }
    
}
