package com.progettobiblioteca.biblioteca.service;

import com.progettobiblioteca.biblioteca.repository.PrestitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestitoService {

    @Autowired
    public PrestitoRepository prestitoRepository;


}
