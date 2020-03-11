package com.example.jugnicaragua.jugnicaragua.dao;

import com.example.jugnicaragua.jugnicaragua.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonDAO extends CrudRepository<Person, Integer> {
}
