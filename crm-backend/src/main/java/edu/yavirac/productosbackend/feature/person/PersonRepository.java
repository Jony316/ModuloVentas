package edu.yavirac.productosbackend.feature.person;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>{
    
    List<Person> findAll();
}
