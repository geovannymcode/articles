package com.example.jugnicaragua.jugnicaragua.service;

import com.example.jugnicaragua.jugnicaragua.dao.IPersonDAO;
import com.example.jugnicaragua.jugnicaragua.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private IPersonDAO dao;


    public Person save(Person t) {

        return dao.save(t);
    }

    public Person update(Person t) {

        return dao.save(t);
    }

    public void delete(Person t) {
       dao.delete(t);

    }

    public List<Person> list() {

        return (List<Person>) dao.findAll();
    }

    public Optional<Person> listId(int id) {
        return dao.findById(id);
    }

}
