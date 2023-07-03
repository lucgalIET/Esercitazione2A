package com.progettobiblioteca.biblioteca.repository;

import com.progettobiblioteca.biblioteca.entities.AutoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AutoreRepository extends JpaRepository<AutoreEntity, Long> {

    @Query(value = "SELECT * " +
            "FROM cliente ", nativeQuery = true)
    List<AutoreEntity> getAllAutore();

//    @Query(value = "SELECT nome, cognome " +
//            "FROM autore ", nativeQuery = true)
//    String getAllAutore;

}
