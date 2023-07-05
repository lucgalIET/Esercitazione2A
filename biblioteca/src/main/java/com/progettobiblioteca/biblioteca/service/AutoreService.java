package com.progettobiblioteca.biblioteca.service;

import com.progettobiblioteca.biblioteca.controller.AutoreController;
import com.progettobiblioteca.biblioteca.dto.AutoreDTO;
import com.progettobiblioteca.biblioteca.dto.LibroDTO;
import com.progettobiblioteca.biblioteca.entities.AutoreEntity;
import com.progettobiblioteca.biblioteca.entities.LibroEntity;
import com.progettobiblioteca.biblioteca.mapper.AutoreMapper;
import com.progettobiblioteca.biblioteca.mapper.LibroMapper;
import com.progettobiblioteca.biblioteca.repository.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutoreService {

    @Autowired
    private AutoreRepository autoreRepository;

    public List<AutoreEntity> getAllAutore() {
        return autoreRepository.findAll();
    }


    public void deleteAutore(Long id) {
        autoreRepository.deleteById(id);
    }
    public AutoreEntity updateAutore(AutoreEntity autoreNew){
        if(autoreNew != null) throw new NullPointerException("Compilare tutti i campi");

        Optional<AutoreEntity> studenteEntity = getAutoreById(autoreNew.getId());

        if(studenteEntity.isEmpty()) throw new NullPointerException();
        return autoreRepository.save(autoreNew);
    }

    public AutoreEntity saveAutore(AutoreEntity entity) {
        return autoreRepository.save(entity);
    }

    public Optional<AutoreEntity> getAutoreById(Long id) {
        return autoreRepository.findById(id);
    }

    //custom
    public List<String> getAutoreByCognome(){
        return autoreRepository.getAutoreByCognome();
    }

    public List<AutoreDTO> getAutoreByCognomeConDto(){
        List<AutoreEntity> autori = autoreRepository.getAutoreByCognomeConDto();
        List<AutoreDTO> result = new ArrayList<>();
        autori.forEach(x -> result.add(AutoreMapper.AUTORE_MAPPER.entityToDto(x)));

        return result;
    }

}
