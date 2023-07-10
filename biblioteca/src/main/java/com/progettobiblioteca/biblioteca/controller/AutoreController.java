package com.progettobiblioteca.biblioteca.controller;

import com.progettobiblioteca.biblioteca.dto.AutoreDTO;
import com.progettobiblioteca.biblioteca.dto.LibroDTO;
import com.progettobiblioteca.biblioteca.entities.AutoreEntity;
import com.progettobiblioteca.biblioteca.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblioteca/autore")
public class AutoreController {
    @Autowired
    private AutoreService autoreService;

    @GetMapping(" ")
    public List<AutoreEntity> getAllLibri(){
        return autoreService.getAllAutore();
    }

    @GetMapping("/get-by-id/{id}")
    public AutoreEntity getAutoreById(@PathVariable Long id){
        return autoreService.getAutoreById(id).get();
    }

    @PostMapping("/save")
    public AutoreEntity saveAutore(@RequestBody AutoreEntity autore){
        return autoreService.saveAutore(autore);
    }

    @PutMapping("/update")
    public AutoreEntity updateAutore(@RequestBody AutoreEntity autore){
        return autoreService.updateAutore(autore);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAutore(@PathVariable Long id){
        autoreService.deleteAutore(id);
    }

    //custom
    @GetMapping("/autori-by-cognome/{iniziale}")
    public List<String> getAutoreByCognome(@PathVariable String iniziale){
        return autoreService.getAutoreByCognome(iniziale);
    }

    @GetMapping("/autori-by-cognome-dto/{iniziale}")
    public List<AutoreDTO> getAutoreByCognomeConDto(@PathVariable String iniziale){
        return autoreService.getAutoreByCognomeConDto(iniziale);
    }


}

