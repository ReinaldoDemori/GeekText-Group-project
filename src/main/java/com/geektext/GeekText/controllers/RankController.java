package com.geektext.GeekText.controllers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geektext.GeekText.entities.Rank;

@RestController
public class RankController {
    JpaRepository<Rank, Integer> ranks;

    public RankController(JpaRepository<Rank, Integer> ranks) {
        this.ranks = ranks;
    }
    
    @GetMapping("/top")
    List<Rank> top() {
        return ranks.findAll();
    }
}
