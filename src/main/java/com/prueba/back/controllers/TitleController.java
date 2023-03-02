package com.prueba.back.controllers;

import com.prueba.back.models.PersonEntity;
import com.prueba.back.models.TitleEntity;
import com.prueba.back.services.PersonService;
import com.prueba.back.services.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/titles/")
public class TitleController {
    @Autowired
    private TitleService titleService;

    @GetMapping("/list/{personId}")
    public Iterable<TitleEntity> getTitlesByPerson(@PathVariable Integer personId) {
        return titleService.findByPersonId(personId);
    }

    @PostMapping("/add/")
    public ResponseEntity<?> addTitle(@RequestBody TitleEntity title){
        titleService.addTitle(title);
        return new ResponseEntity<>(title, HttpStatus.CREATED);
    }

    @PostMapping("/update/")
    public ResponseEntity<?> updatePerson(@RequestBody TitleEntity title){
        titleService.updateTitle(title);
        return new ResponseEntity<>(title, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Integer> deleteTitle(@PathVariable Integer id) {

        titleService.deleteTitle(id);

        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}

