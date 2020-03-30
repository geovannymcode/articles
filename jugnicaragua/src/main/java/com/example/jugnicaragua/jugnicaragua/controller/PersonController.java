package com.example.jugnicaragua.jugnicaragua.controller;

import com.example.jugnicaragua.jugnicaragua.exception.ModelNotFoundException;
import com.example.jugnicaragua.jugnicaragua.model.Person;
import com.example.jugnicaragua.jugnicaragua.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonController {


    @Autowired
    PersonService personService;

    @PostMapping("/save")
    public long save(@RequestBody Person person) {
        personService.save(person);
        return person.getIdPerson();
    }

    @GetMapping("/listAll")
    public Iterable<Person> listAllPersons() {
        return personService.list();
    }

    @GetMapping("/list/{id}")
    public Person listPersonById(@PathVariable("id") int id) {
        Optional<Person> person = personService.listId(id);
        if(person.isPresent()) {
            return person.get();
        }

        throw new ModelNotFoundException("Invalid find person provided");
    }

}
