package com.example.jugnicaragua.jugnicaragua.dao;

import com.example.jugnicaragua.jugnicaragua.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonDAO extends CrudRepository<Person, Long> {

}
