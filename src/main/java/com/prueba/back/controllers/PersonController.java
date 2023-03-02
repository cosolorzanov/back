package com.prueba.back.controllers;

import com.prueba.back.models.PersonEntity;
import com.prueba.back.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/people/")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/list")
    public Iterable<PersonEntity> getAllPerson() {
        return personService.findAll();
    }

    @PostMapping("/add/")
    public ResponseEntity<?> addPerson(@RequestBody PersonEntity person){
        personService.addPerson(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

    @PostMapping("/update/")
    public ResponseEntity<?> updatePerson(@RequestBody PersonEntity person){
        personService.updatePerson(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Integer> deletePerson(@PathVariable Integer id) {

        personService.deletePerson(id);

        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}

