package com.prueba.back.repositories;

import com.prueba.back.models.PersonEntity;
import com.prueba.back.models.TitleEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitleRepository extends CrudRepository<TitleEntity, Integer> {

    @Query("SELECT t FROM TitleEntity t WHERE t.personId = ?1 ")
    Iterable<TitleEntity> findByPersonId(Integer personId );

}
