package com.progettobiblioteca.biblioteca.repository;

import com.progettobiblioteca.biblioteca.entities.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<LibroEntity, Long> {
}
