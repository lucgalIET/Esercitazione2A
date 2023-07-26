package com.progettobiblioteca.biblioteca.repository;

import com.progettobiblioteca.biblioteca.entities.AutoreEntity;
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
            "WHERE cognome LIKE :iniziale% ", nativeQuery = true)
    List<String> getAutoreByCognome(@Param("iniziale") String iniziale);

    @Query(value = "SELECT * " +
            "FROM autore " +
            "WHERE cognome LIKE :iniziale% ", nativeQuery = true)
    List<AutoreEntity> getAutoreByCognomeConDto(@Param("iniziale") String iniziale);

}
