package com.geektext.GeekText.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.geektext.GeekText.entities.Book;



public interface BookRepository extends JpaRepository<Book, String> {
    
}
