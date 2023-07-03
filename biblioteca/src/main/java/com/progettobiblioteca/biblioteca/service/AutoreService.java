package com.progettobiblioteca.biblioteca.service;

import com.progettobiblioteca.biblioteca.entities.AutoreEntity;
import com.progettobiblioteca.biblioteca.repository.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoreService {

    @Autowired
    private AutoreRepository autoreRepository;

    public List<AutoreEntity> getAllAutore() {
        return autoreRepository.findAll();
    }

    //custom
    /*public List<AutoreEntity> getAllAutoreCustom(){
        return autoreRepository.getAllAutore();
    }*/

    public Optional<AutoreEntity> getClienteById(Long id) {
        return autoreRepository.findById(id);
    }
    public void deleteAutore(Long id) {
        autoreRepository.deleteById(id);
    }

    public AutoreEntity updateAutore(AutoreEntity clienteNew){
        if(clienteNew != null) throw new NullPointerException("Compilare tutti i campi");

        Optional<AutoreEntity> studenteEntity = getClienteById(clienteNew.getId());

        if(studenteEntity.isEmpty()) throw new NullPointerException();
        return autoreRepository.save(clienteNew);
    }

    public AutoreEntity saveAutore(AutoreEntity entity) {
        return autoreRepository.save(entity);
    }
}
