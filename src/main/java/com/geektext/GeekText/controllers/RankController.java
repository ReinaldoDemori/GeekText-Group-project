package com.geektext.GeekText.controllers;

import java.util.List;

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
        return ranks.getRanking(page * 5);
    }

    @GetMapping("/rank/genre/{genre}/{page}")
    @ResponseBody
    List<Rank> topGenre(@PathVariable("page") int page, @PathVariable("genre") String genre) {
        return ranks.getRankingGenre(page * 5, genre);
    }
}
