package com.example.carsharing.controllers;

import com.example.carsharing.entities.Person;
import com.example.carsharing.exeptions.PersonNotFoundException;
import com.example.carsharing.repositories.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons")
    List<Person> all() {
        return repository.findAll();
    }


    @PostMapping("/persons/newPerson")
    Person newPerson(@RequestBody Person newPerson) {
        return repository.save(newPerson);
    }

    @GetMapping("/persons/{id}")
    Person one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

    @PutMapping("/persons/{id}")
    Person replaceEmployee(@RequestBody Person newPerson, @PathVariable Long id) {

        return repository.findById(id)
                .map(person -> {
                    person.setName(newPerson.getName());
                    return repository.save(person);
                })
                .orElseGet(() -> {
                    newPerson.setId(id);
                    return repository.save(newPerson);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
