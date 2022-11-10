package com.geektext.GeekText.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.geektext.GeekText.entities.Book;
import com.geektext.GeekText.repositories.BookRepository;

@RestController
public class RankController {
    BookRepository books;
    
    public RankController(BookRepository books) {
        this.books = books;
    }

    @GetMapping("/rank/top/{page}")
    @ResponseBody
    List<Book> top(@PathVariable("page") int page) {
        List<Book> ranking = books.getByRanking();
        int lower = Math.min(ranking.size(), page * 5);
        int upper = Math.min(ranking.size(), (page + 1) * 5);
        return ranking.subList(lower, upper);
    }

    @GetMapping("/rank/genre/{genre}/{page}")
    @ResponseBody
    List<Book> topGenre(@PathVariable("page") int page, @PathVariable("genre") String genre) {
        List<Book> ranking = books.getByRanking().stream().filter(book -> book.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
        int lower = Math.min(ranking.size(), page * 5);
        int upper = Math.min(ranking.size(), (page + 1) * 5);
        return ranking.subList(lower, upper);
    }


    @GetMapping("/rank/sold/{page}")
    @ResponseBody
    List<Book> topSold(@PathVariable("page") int page) {
        List<Book> ranking = books.getBySold();
        int lower = Math.min(ranking.size(), page * 5);
        int upper = Math.min(ranking.size(), (page + 1) * 5);
        return ranking.subList(lower, upper);
    }
    
}
