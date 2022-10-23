package com.geektext.GeekText.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.geektext.GeekText.entities.Rank;

public interface RankRepository extends JpaRepository<Rank, Integer> {

    @Query("select r from Rank r where r.rank >= ?1 order by r.rank")
    List<Rank> getRanking(Integer start);
}