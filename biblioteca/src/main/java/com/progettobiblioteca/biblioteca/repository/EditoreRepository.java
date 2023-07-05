package com.progettobiblioteca.biblioteca.repository;

import com.progettobiblioteca.biblioteca.entities.EditoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EditoreRepository extends JpaRepository<EditoreEntity, Long> {


    @Query(value = "SELECT * " +
            "FROM cliente ", nativeQuery = true)
    List<EditoreEntity> getAllEditore();

}
