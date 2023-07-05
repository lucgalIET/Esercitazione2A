package com.progettobiblioteca.biblioteca.mapper;

import com.progettobiblioteca.biblioteca.dto.LibroDTO;
import com.progettobiblioteca.biblioteca.entities.LibroEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface LibroMapper {

    LibroMapper LIBRO_MAPPER = Mappers.getMapper(LibroMapper.class);
    @Mapping(source = "id", target = "id")
    @Mapping(source = "titolo", target = "titolo")
    @Mapping(source = "genere", target = "genere")
    LibroDTO entityToDto(LibroEntity libroEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "titolo", target = "titolo")
    @Mapping(source = "genere", target = "genere")
    LibroEntity dtoEntity(LibroDTO libroDTO);


}
