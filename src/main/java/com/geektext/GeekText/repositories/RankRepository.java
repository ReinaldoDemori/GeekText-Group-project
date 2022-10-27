package com.geektext.GeekText.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.geektext.GeekText.entities.Rank;

public interface RankRepository extends JpaRepository<Rank, Integer> {

    @Query("select r from Rank r where r.rank >= ?1 and r.rank < ?1 + 5 order by r.rank")
    List<Rank> getRanking(Integer start);

    @Query("select r from Rank r where r.rank >= ?1 and r.rank < ?1 + 5 and r.book.genre = ?2 order by r.rank")
    List<Rank> getRankingGenre(Integer start, String genre);
}