package com.progettobiblioteca.biblioteca.service;

import com.progettobiblioteca.biblioteca.entities.EditoreEntity;
import com.progettobiblioteca.biblioteca.repository.EditoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditoreService {

    @Autowired
    private EditoreRepository editoreRepository;


    public List<EditoreEntity> getAllEditore() {
        return editoreRepository.findAll();
    }

    //custom
    /*public List<AutoreEntity> getAllAutoreCustom(){
        return autoreRepository.getAllAutore();
    }*/

    public Optional<EditoreEntity> getEditoreById(Long id) {
        return editoreRepository.findById(id);
    }

    public void deleteEditore(Long id) {
        editoreRepository.deleteById(id);
    }

    public EditoreEntity updateEditore(EditoreEntity editoreNew) {
        if (editoreNew != null) throw new NullPointerException("Compilare tutti i campi");

        Optional<EditoreEntity> EditoreEntity = getEditoreById(editoreNew.getId());

        if (EditoreEntity.isEmpty()) throw new NullPointerException();
        return editoreRepository.save(editoreNew);
    }

    public EditoreEntity saveEditore(EditoreEntity entity) {
        return editoreRepository.save(entity);
    }
}