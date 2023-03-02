package com.prueba.back.services;


import com.prueba.back.models.PersonEntity;

public interface PersonService {
    Iterable<PersonEntity> findAll ();
    PersonEntity addPerson (PersonEntity person);

    PersonEntity updatePerson (PersonEntity person);

    boolean deletePerson(Integer id);
}
