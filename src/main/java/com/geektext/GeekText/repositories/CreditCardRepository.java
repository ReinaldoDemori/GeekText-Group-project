package com.geektext.GeekText.repositories;

import com.geektext.GeekText.entities.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface CreditCardRepository extends JpaRepository<CreditCard, String> {

    @Query("Select b FROM Person b WHERE b.username.username = ?1")
    List<CreditCard> findByUsername(String username);


}
