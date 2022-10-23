package com.geektext.GeekText.controllers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geektext.GeekText.entities.Rank;
import com.geektext.GeekText.repositories.RankRepository;

@RestController
public class RankController {
    RankRepository ranks;

    public RankController(RankRepository ranks) {
        this.ranks = ranks;
    }
    
    @GetMapping("/top")
    List<Rank> top() {
        return ranks.getRanking(1);
    }
}
