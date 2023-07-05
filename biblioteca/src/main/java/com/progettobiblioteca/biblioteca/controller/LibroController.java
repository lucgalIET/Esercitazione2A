package com.progettobiblioteca.biblioteca.controller;

import com.progettobiblioteca.biblioteca.dto.LibroDTO;
import com.progettobiblioteca.biblioteca.entities.LibroEntity;
import com.progettobiblioteca.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblioteca/libro")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping("/get-all")
    public List<LibroEntity> getAllLibri(){
        return libroService.getAllLibro();
    }

    @GetMapping("/get-by-id/{id}")
    public LibroEntity getLibroById(@PathVariable Long id){
        return libroService.getLibroById(id).get();
    }

    @PostMapping("/save")
    public LibroEntity saveLibro(@RequestBody LibroEntity libro){
        return libroService.saveLibro(libro);
    }

    @PutMapping("/update")
    public LibroEntity updateLibro(@RequestBody LibroEntity libro){
        return libroService.updateLibro(libro);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLibro(@PathVariable Long id){
        libroService.deleteLibro(id);
    }

    //custom
    @GetMapping("/get-libro-by-genere/{genere}")
    public List<LibroDTO> getLibroByGenere(@PathVariable String genere){
        return libroService.getLibroByGenere(genere);
    }
}
