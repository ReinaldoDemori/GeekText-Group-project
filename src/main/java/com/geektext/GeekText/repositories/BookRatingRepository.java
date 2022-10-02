package com.geektext.GeekText.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.geektext.GeekText.entities.BookRating;

public interface BookRatingRepository extends JpaRepository<BookRating, Integer> {

}