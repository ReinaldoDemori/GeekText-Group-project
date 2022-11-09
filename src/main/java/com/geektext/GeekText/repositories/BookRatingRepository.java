package com.geektext.GeekText.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.geektext.GeekText.entities.BookRating;

public interface BookRatingRepository extends JpaRepository<BookRating, Integer> {
    @Query("Select r from book_rating r where ?1 > 0 DESC")
    List<BookRating> findByBookRatings(String isbn);

    @Query("Select AVG(r.rating) from book_rating r where b.isbn.isbn = ?1")
    List<BookRating> findByRatings(float rating);
}