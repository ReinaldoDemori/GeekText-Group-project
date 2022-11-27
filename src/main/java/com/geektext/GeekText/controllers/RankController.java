package com.geektext.GeekText.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.geektext.GeekText.entities.Book;
import com.geektext.GeekText.repositories.BookRatingRepository;
import com.geektext.GeekText.repositories.BookRepository;

@RestController
public class RankController {
    BookRepository books;
    BookRatingRepository ratings;
    
    public RankController(BookRepository books, BookRatingRepository ratings) {
        this.books = books;
        this.ratings = ratings;
    }

    static <A> List<A> page(List<A> items, int page) {
        int lower = Math.min(items.size(), page * 5);
        int upper = Math.min(items.size(), (page + 1) * 5);
        return items.subList(lower, upper);
    }

    @GetMapping("/rank/top/{page}")
    @ResponseBody
    List<Book> top(@PathVariable("page") int page) {
        List<Book> ranking = books.getByRanking();
        return page(ranking, page);
    }

    @GetMapping("/rank/genre/{genre}/{page}")
    @ResponseBody
    List<Book> topGenre(@PathVariable("page") int page, @PathVariable("genre") String genre) {
        List<Book> ranking = books.getByRanking().stream().filter(book -> book.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
        return page(ranking, page);
    }


    @GetMapping("/rank/sold/{page}")
    @ResponseBody
    List<Book> topSold(@PathVariable("page") int page) {
        List<Book> ranking = books.getBySold();
        return page(ranking, page);
    }

    @GetMapping("/rank/rated/{limit}/{page}")
    List<Book> rated(@PathVariable("limit") float limit, @PathVariable("page")int page) {
        var rated  = ratings.findAll();
        List<Book> items = rated.stream().filter(rate -> rate.getRating() >= limit).map(x -> x.getIsbn()).collect(Collectors.toList());
        return page(items, page);
    }

    
}
