package com.prueba.back.controllers;

import com.prueba.back.models.DocumenttypeEntity;
import com.prueba.back.models.PersonEntity;
import com.prueba.back.repositories.DocumenttypeRepository;
import com.prueba.back.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/document_type/")
public class DocumentTypeController {
    @Autowired
    DocumenttypeRepository documenttypeRepository;
    @GetMapping("/list")
    public Iterable<DocumenttypeEntity> getDocumentTypes() {
        return documenttypeRepository.findAll();
    }
}
