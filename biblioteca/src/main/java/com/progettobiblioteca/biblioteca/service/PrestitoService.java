package com.progettobiblioteca.biblioteca.service;

import com.progettobiblioteca.biblioteca.entities.LibroEntity;
import com.progettobiblioteca.biblioteca.entities.PrestitoEntity;
import com.progettobiblioteca.biblioteca.repository.LibroRepository;
import com.progettobiblioteca.biblioteca.repository.PrestitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestitoService {

    @Autowired
    public PrestitoRepository prestitoRepository;

        public List<PrestitoEntity> getAllEditore() {
            return prestitoRepository.findAll();
        }

        //custom
    /*public List<AutoreEntity> getAllAutoreCustom(){
        return autoreRepository.getAllAutore();
    }*/

        public Optional<PrestitoEntity> getPrestitoById(Long id) {
            return prestitoRepository.findById(id);
        }

        public void deletePrestito(Long id) {
            prestitoRepository.deleteById(id);
        }

        public PrestitoEntity updatePrestito(PrestitoEntity prestitoNew) {
            if (prestitoNew != null) throw new NullPointerException("Compilare tutti i campi");

            Optional<PrestitoEntity> prestitoEntity = getPrestitoById(prestitoNew.getId());

            if (prestitoEntity.isEmpty()) throw new NullPointerException();
            return prestitoRepository.save(prestitoNew);
        }

        public PrestitoEntity saveLibro(PrestitoEntity entity) {
            return prestitoRepository.save(entity);
        }

}
