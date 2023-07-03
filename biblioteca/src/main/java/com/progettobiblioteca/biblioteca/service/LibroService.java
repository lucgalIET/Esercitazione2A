package com.progettobiblioteca.biblioteca.service;

import com.progettobiblioteca.biblioteca.entities.LibroEntity;
import com.progettobiblioteca.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;


    public List<LibroRepository> getAllEditore() {
        return libroRepository.findAll();
    }

    //custom
    /*public List<AutoreEntity> getAllAutoreCustom(){
        return autoreRepository.getAllAutore();
    }*/

    public Optional<LibroRepository> getEditoreById(Long id) {
        return libroRepository.findById(id);
    }

    public void deleteEditorte(Long id) {
        libroRepository.deleteById(id);
    }

    public LibroRepository updateEditore(LibroRepository libroNew) {
        if (libroNew != null) throw new NullPointerException("Compilare tutti i campi");

        Optional<LibroRepository> LibroEntity = getEditoreById(libroNew.getId());

        if (LibroEntity.isEmpty()) throw new NullPointerException();
        return libroRepository.save(libroNew);
    }

    public LibroRepository saveEditore(LibroRepository entity) {
        return libroRepository.save(entity);
    }
}