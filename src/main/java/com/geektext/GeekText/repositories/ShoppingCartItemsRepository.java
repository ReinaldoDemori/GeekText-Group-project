package com.geektext.GeekText.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.geektext.GeekText.entities.ShoppingCartItems;

public interface ShoppingCartItemsRepository extends JpaRepository<ShoppingCartItems, Integer> {

}