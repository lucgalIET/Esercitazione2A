package com.progettobiblioteca.biblioteca.repository;

import com.progettobiblioteca.biblioteca.entities.AutoreEntity;
import com.progettobiblioteca.biblioteca.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    @Query(value = "SELECT * " +
            "FROM cliente ", nativeQuery = true)
    List<ClienteEntity> getAllCliente();



}
