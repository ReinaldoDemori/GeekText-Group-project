
package com.geektext.GeekText.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.geektext.GeekText.entities.Author;


public interface AuthorRepository extends JpaRepository<Author, Integer> {
    
}
