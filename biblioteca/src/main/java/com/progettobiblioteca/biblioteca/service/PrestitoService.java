package com.progettobiblioteca.biblioteca.service;

import com.progettobiblioteca.biblioteca.dto.PrestitoDTO;
import com.progettobiblioteca.biblioteca.entities.PrestitoEntity;
import com.progettobiblioteca.biblioteca.mapper.PrestitoMapper;
import com.progettobiblioteca.biblioteca.repository.PrestitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PrestitoService {

    @Autowired
    public PrestitoRepository prestitoRepository;

        public List<PrestitoEntity> getAllPrestito() {
            return prestitoRepository.findAll();
        }

        public Optional<PrestitoEntity> getPrestitoById(Long id) {
            return prestitoRepository.findById(id);
        }

        public void deletePrestito(Long id) {
            prestitoRepository.deleteById(id);
        }

        public PrestitoEntity updatePrestito(PrestitoEntity prestitoNew) {
            if (prestitoNew == null) throw new NullPointerException("Compilare tutti i campi");

            Optional<PrestitoEntity> prestitoEntity = getPrestitoById(prestitoNew.getId());

            if (prestitoEntity.isEmpty()) throw new NullPointerException();
            return prestitoRepository.save(prestitoNew);
        }

        public PrestitoEntity savePrestito(PrestitoEntity entity) {
            return prestitoRepository.save(entity);
        }

        public List<PrestitoDTO> getPrestitiByMese(Long mese){
            List<PrestitoDTO> prestitiOutput = new ArrayList<>();
            List<PrestitoEntity> prestiti = prestitoRepository.getPrestitiByMese(mese);
            prestiti.forEach(x -> prestitiOutput.add(PrestitoMapper.PRESTITO_MAPPER.entityToDto(x)));
            return prestitiOutput;
        }

}
