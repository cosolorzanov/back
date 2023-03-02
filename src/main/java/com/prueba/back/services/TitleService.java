package com.prueba.back.services;


import com.prueba.back.models.TitleEntity;

public interface TitleService {

    Iterable<TitleEntity> findByPersonId(Integer personId);

    TitleEntity addTitle (TitleEntity title);

    TitleEntity updateTitle (TitleEntity title);

    boolean deleteTitle(Integer id);
}
