package com.progettobiblioteca.biblioteca.repository;

import com.progettobiblioteca.biblioteca.dto.AutoreDTO;
import com.progettobiblioteca.biblioteca.entities.AutoreEntity;
import com.progettobiblioteca.biblioteca.entities.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AutoreRepository extends JpaRepository<AutoreEntity, Long> {

    @Query(value = "SELECT * " +
            "FROM cliente ", nativeQuery = true)
    List<AutoreEntity> getAllAutore();

    @Query(value = "SELECT nome, cognome " +
            "FROM autore " +
            "WHERE cognome LIKE \"B%\" ", nativeQuery = true)
    List<String> getAutoreByCognome();

    @Query(value = "SELECT * " +
            "FROM autore " +
            "WHERE cognome LIKE \"B%\" ", nativeQuery = true)
    List<AutoreEntity> getAutoreByCognomeConDto();

    @Query(value = "select l.* from libro l, autore a, autore_libro al where :id = al.id_autore AND l.id = al.id_libro", nativeQuery = true)
    List<LibroEntity> getLibriByAutore(@Param("id") Long id_autore);

}
