package com.geektext.GeekText.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.geektext.GeekText.entities.Rank;

public interface RankRepository extends JpaRepository<Rank, Integer> {

}