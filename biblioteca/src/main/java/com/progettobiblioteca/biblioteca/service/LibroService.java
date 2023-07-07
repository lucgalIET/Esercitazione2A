package com.progettobiblioteca.biblioteca.service;

import com.progettobiblioteca.biblioteca.dto.AutoreDTO;
import com.progettobiblioteca.biblioteca.dto.LibroDTO;
import com.progettobiblioteca.biblioteca.entities.LibroEntity;
import com.progettobiblioteca.biblioteca.mapper.LibroMapper;
import com.progettobiblioteca.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;


    public List<LibroEntity> getAllLibro() {
        return libroRepository.findAll();
    }

    //custom
    /*public List<AutoreEntity> getAllAutoreCustom(){
        return autoreRepository.getAllAutore();
    }*/

    public Optional<LibroEntity> getLibroById(Long id) {
        return libroRepository.findById(id);
    }

    public void deleteLibro(Long id) {
        libroRepository.deleteById(id);
    }

    public LibroEntity updateLibro(LibroEntity libroNew) {
        if (libroNew != null) throw new NullPointerException("Compilare tutti i campi");

        Optional<LibroEntity> LibroEntity = getLibroById(libroNew.getId());

        if (LibroEntity.isEmpty()) throw new NullPointerException();
        return libroRepository.save(libroNew);
    }

    public LibroEntity saveLibro(LibroEntity entity) {
        return libroRepository.save(entity);
    }


    //custom
    public List<LibroDTO> getLibroByGenere(String genere){
        List<LibroEntity> libri = libroRepository.getLibroByGenere(genere);
        List<LibroDTO> result = new ArrayList<>();
        libri.forEach(x -> result.add(LibroMapper.LIBRO_MAPPER.entityToDto(x)));
        return result;
    }

    public List<LibroDTO> getLibriByAutore(Long id_autore){
        List<LibroEntity> libri = libroRepository.getLibriByAutore(id_autore);
        List<LibroDTO> result = new ArrayList<>();
        libri.forEach(x -> result.add(LibroMapper.LIBRO_MAPPER.entityToDto(x)));
        return result;
    }

    public List<LibroDTO> getPrestitiByCliente(String nome){
        List<LibroEntity> libri = libroRepository.getPrestitiByCliente(nome);
        List<LibroDTO> result = new ArrayList<>();
        libri.forEach(x -> result.add(LibroMapper.LIBRO_MAPPER.entityToDto(x)));
        return result;
    }
}