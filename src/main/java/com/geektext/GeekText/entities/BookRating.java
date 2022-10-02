package com.geektext.GeekText.entities;


import javax.persistence.*;


@Entity
@Table(name = "book_rating")
@IdClass(BookRating.class)
public class BookRating implements Serializable {

    @Id
    @ManyToOne(targetEntity = Book.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "isbn")
    private Book isbn;

    @Id
    @ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Person personID;

    private float rating;

    private String comment;

    public BookRating() {}
    public BookRating(Book isbn, Person personID, float rating, String comment) {
        this.isbn = isbn;
        this.personID = personID;
        this.rating = rating;
        this.comment = comment;
    }

    public Book getIsbn() {
        return this.isbn;
    }

    public void setIsbn(Book isbn) {
        this.isbn = isbn;
    }

    public Person getPersonID() {
        return this.personID;
    }

    public void setPersonID(Person personID) {
        this.personID = personID;
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
