package com.progettobiblioteca.biblioteca.controller;

import com.progettobiblioteca.biblioteca.entities.PrestitoEntity;
import com.progettobiblioteca.biblioteca.service.PrestitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblioteca/prestito")
public class PrestitoController {
    @Autowired
    private PrestitoService prestitoService;

    @GetMapping("/get-all")
    public List<PrestitoEntity> getAllLibri(){
        return prestitoService.getAllPrestito();
    }

    @GetMapping("/get-by-id/{id}")
    public PrestitoEntity getPrestitoById(@PathVariable Long id){
        return prestitoService.getPrestitoById(id).get();
    }

    @PostMapping("/save")
    public PrestitoEntity savePrestito(@RequestBody PrestitoEntity prestito){
        return prestitoService.savePrestito(prestito);
    }

    @PutMapping("/update")
    public PrestitoEntity updatePrestito(@RequestBody PrestitoEntity prestito){
        return prestitoService.updatePrestito(prestito);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePrestito(@PathVariable Long id){
        prestitoService.deletePrestito(id);
    }
}
