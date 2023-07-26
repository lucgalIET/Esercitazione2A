package com.progettobiblioteca.biblioteca.repository;

import com.progettobiblioteca.biblioteca.entities.PrestitoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PrestitoRepository extends JpaRepository<PrestitoEntity, Long> {

    @Query(value = "SELECT * " +
            "FROM cliente ", nativeQuery = true)
    List<PrestitoEntity> getAllPrestito();


    @Query(value = "select * from prestito " +
            "where month(data_ritiro) = :mese", nativeQuery = true)
    List<PrestitoEntity> getPrestitiByMese(@Param("mese") Long mese);


}
