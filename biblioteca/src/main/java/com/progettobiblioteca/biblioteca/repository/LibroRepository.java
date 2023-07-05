package com.progettobiblioteca.biblioteca.repository;

import com.progettobiblioteca.biblioteca.entities.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LibroRepository extends JpaRepository<LibroEntity, Long> {

    @Query(value = "SELECT * " +
            "FROM cliente ", nativeQuery = true)
    List<LibroEntity> getAllLibro();

    //@Query(value = "SELECT ")

}
