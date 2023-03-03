package com.prueba.back.services;

import com.prueba.back.models.TitleEntity;
import com.prueba.back.repositories.PersonRepository;
import com.prueba.back.models.PersonEntity;
import com.prueba.back.repositories.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;


@Service
public class PersonServiceImp implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private TitleRepository titleRepository;
    public Iterable<PersonEntity> findAll (){
        return  personRepository.findAll();
    }

    public PersonEntity addPerson (PersonEntity person){
        person.setCreationDate(new Timestamp(System.currentTimeMillis()));
        personRepository.save(person);

        return  person;
    }

    @Override
    public PersonEntity updatePerson(PersonEntity person) {
        if (personRepository.findById(person.getId()).isPresent()){
            PersonEntity oldPerson = personRepository.findById(person.getId()).get();
            person.setCreationDate(oldPerson.getCreationDate());
            personRepository.save(person);
            return  person;
        }
        return new PersonEntity();
    }

    @Override
    public boolean deletePerson(Integer id) {
        personRepository.deleteById(id);
        return true;
    }
}
