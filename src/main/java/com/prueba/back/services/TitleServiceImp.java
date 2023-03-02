package com.prueba.back.services;

import com.prueba.back.models.TitleEntity;
import com.prueba.back.repositories.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitleServiceImp implements TitleService {

    @Autowired
    TitleRepository titleRepository;
    @Override
    public Iterable<TitleEntity> findByPersonId(Integer personId) {
        return titleRepository.findByPersonId(personId);
    }

    @Override
    public TitleEntity addTitle(TitleEntity title) {
        titleRepository.save(title);
        return title;
    }

    @Override
    public TitleEntity updateTitle(TitleEntity title) {
        titleRepository.save(title);
        return title;
    }

    @Override
    public boolean deleteTitle(Integer id) {
        titleRepository.deleteById(id);
        return true;
    }
}
