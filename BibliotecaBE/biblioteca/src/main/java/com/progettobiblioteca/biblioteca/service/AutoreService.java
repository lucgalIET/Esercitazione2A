package com.progettobiblioteca.biblioteca.service;

import com.progettobiblioteca.biblioteca.dto.AutoreDTO;
import com.progettobiblioteca.biblioteca.entities.AutoreEntity;
import com.progettobiblioteca.biblioteca.mapper.AutoreMapper;
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
        if(autoreNew == null) throw new NullPointerException("Compilare tutti i campi");

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
    public List<String> getAutoreByCognome(String iniziale){
        return autoreRepository.getAutoreByCognome(iniziale);
    }

    public List<AutoreDTO> getAutoreByCognomeConDto(String iniziale){
        List<AutoreEntity> autori = autoreRepository.getAutoreByCognomeConDto(iniziale);
        List<AutoreDTO> result = new ArrayList<>();
        autori.forEach(x -> result.add(AutoreMapper.AUTORE_MAPPER.entityToDto(x)));

        return result;
    }

}
