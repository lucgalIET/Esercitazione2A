package com.progettobiblioteca.biblioteca.repository;

import com.progettobiblioteca.biblioteca.entities.LibroEntity;
import com.progettobiblioteca.biblioteca.entities.PrestitoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestitoRepository extends JpaRepository<PrestitoEntity, Long> {
}
