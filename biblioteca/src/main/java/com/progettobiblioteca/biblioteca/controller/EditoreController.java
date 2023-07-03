package com.progettobiblioteca.biblioteca.controller;

import com.progettobiblioteca.biblioteca.entities.EditoreEntity;
import com.progettobiblioteca.biblioteca.service.EditoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblioteca/editore")
public class EditoreController {
    @Autowired
    private EditoreService editoreService;

    @GetMapping("/get-all")
    public List<EditoreEntity> getAllLibri(){
        return editoreService.getAllEditore();
    }

    @GetMapping("/get-by-id/{id}")
    public EditoreEntity getEditoreById(@PathVariable Long id){
        return editoreService.getEditoreById(id).get();
    }

    @PostMapping("/save")
    public EditoreEntity saveEditore(@RequestBody EditoreEntity editore){
        return editoreService.saveEditore(editore);
    }

    @PutMapping("/update")
    public EditoreEntity updateEditore(@RequestBody EditoreEntity editore){
        return editoreService.updateEditore(editore);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEditore(@PathVariable Long id){
        editoreService.deleteEditore(id);
    }
}
