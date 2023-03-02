package com.prueba.back.repositories;

import com.prueba.back.models.DocumenttypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumenttypeRepository extends CrudRepository<DocumenttypeEntity, Integer> {

}
