package com.geektext.GeekText.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.mapping.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.geektext.GeekText.entities.Rank;
import com.geektext.GeekText.repositories.RankRepository;

@RestController
public class RankController {
    RankRepository ranks;

    public RankController(RankRepository ranks) {
        this.ranks = ranks;
    }
    
    @GetMapping("/rank/top/{page}")
    @ResponseBody
    List<Rank> top(@PathVariable("page") int page) {
        List<Rank> ranking = ranks.getRanking();
        int lower = Math.min(ranking.size(), page * 5);
        int upper = Math.min(ranking.size(), (page + 1) * 5);
        return ranking.subList(lower, upper);
    }

    @GetMapping("/rank/genre/{genre}/{page}")
    @ResponseBody
    List<Rank> topGenre(@PathVariable("page") int page, @PathVariable("genre") String genre) {
        List<Rank> ranking = ranks.getRanking().stream().filter(rank -> rank.book.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
        int lower = Math.min(ranking.size(), page * 5);
        int upper = Math.min(ranking.size(), (page + 1) * 5);
        return ranking.subList(lower, upper);
    }
}
