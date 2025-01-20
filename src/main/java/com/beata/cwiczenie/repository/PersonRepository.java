package com.beata.cwiczenie.repository;


import com.beata.cwiczenie.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonRepository extends JpaRepository<Person, Long>{

}