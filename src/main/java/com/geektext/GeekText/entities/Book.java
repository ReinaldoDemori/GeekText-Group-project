package com.geektext.GeekText.entities;


import javax.persistence.*;


@Entity
public class Book {

    @Id
    private String isbn;
    
    private String bName;
    
    private String bDesc;
    
    private double bPrice;
    
    private String genre;

    private String publisher;
    
    private String pubYear;
    
    private int sCopies;

    private int ranking;
    
    @ManyToOne(targetEntity = Author.class)
    @JoinColumn(name = "authorid")
    private Author authorID;

    public Book() {
    }
    public Book(String isbn, String bName, String bDesc, double bPrice, String genre, String publisher, String pubYear, int sCopies, int ranking) {
        this.isbn = isbn;
        this.bName = bName;
        this.bDesc = bDesc;
        this.bPrice = bPrice;
        this.genre = genre;
        this.publisher = publisher;
        this.pubYear = pubYear;
        this.sCopies = sCopies;
        this.ranking = ranking;
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

    public int getRanking() {
        return ranking;
    }
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
   
}
