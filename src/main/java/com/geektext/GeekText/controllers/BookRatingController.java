package com.geektext.GeekText.controllers;

import java.util.List;
import com.geektext.GeekText.entities.BookRating;
import com.geektext.GeekText.exceptions.BookRatingNotFoundException;
import com.geektext.GeekText.repositories.BookRatingRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookRatingController {
    private final BookRatingRepository repository;

    BookRatingController(BookRatingRepository repository){
        this.repository = repository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/comments")
    List<BookRating> all() {
      return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/comments")
    BookRating newBookRating(@RequestBody BookRating newBookRating) {
      return repository.save(newBookRating);
    }

    // Single item
    @GetMapping("/comments/{commentID}")
    BookRating one(@PathVariable Integer commentID) {

      return repository.findById(commentID)
        .orElseThrow(() -> new BookRatingNotFoundException(commentID)); //need to create exception file
    }

    @PutMapping("/comments/{commentID}")
    BookRating replaceBookRating(@RequestBody BookRating newBookRating, @PathVariable Integer commentID) {

      return repository.findById(commentID)
        .map(comment -> {
          comment.setRating(newBookRating.getRating());
          comment.setComment(newBookRating.getComment());
          return repository.save(comment);
        })
        .orElseGet(() -> {
          newBookRating.setCommentID(commentID);
          return repository.save(newBookRating);
        });
    }

    @DeleteMapping("/comments/{commentID}")
    void deleteBookRating(@PathVariable Integer commentID) {
      repository.deleteById(commentID);
    }
}
