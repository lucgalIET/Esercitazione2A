package com.progettobiblioteca.biblioteca.repository;

import com.progettobiblioteca.biblioteca.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
