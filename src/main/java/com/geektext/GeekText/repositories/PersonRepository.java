package com.geektext.GeekText.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.geektext.GeekText.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}