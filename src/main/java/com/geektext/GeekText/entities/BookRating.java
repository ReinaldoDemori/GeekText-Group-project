package com.geektext.GeekText.entities;

import javax.persistence.*;


@Entity
@Table(name = "book_rating")
public class BookRating{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentID;

    @ManyToOne(targetEntity = Book.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "isbn")
    private Book isbn;

    @ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "username")
    private Person username;

    private float rating;

    private String comment;

    public BookRating() {}
    public BookRating(Book isbn, Person username, float rating, String comment) {
        this.isbn = isbn;
        this.username = username;
        this.rating = rating;
        this.comment = comment;
    }

    public Integer getCommentID() {
        return this.commentID;
    }
    public void setCommentID(Integer commentID) {
        this.commentID = commentID;
    }

    public Book getIsbn() {
        return this.isbn;
    }

    public void setIsbn(Book isbn) {
        this.isbn = isbn;
    }

    public Person getPersonID() {
        return this.username;
    }

    public void setPersonID(Person username) {
        this.username = username;
    }

    public float getRating() {
        return this.rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
