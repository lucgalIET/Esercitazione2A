package com.progettobiblioteca.biblioteca.mapper;

import com.progettobiblioteca.biblioteca.dto.LibroDTO;
import com.progettobiblioteca.biblioteca.entities.LibroEntity;
import org.mapstruct.Mapping;
import org.springframework.jmx.export.annotation.ManagedOperation;

@Mapper
public interface LibroMapper {

    LibroMapper LIBRO_MAPPER = Mapper.getMapper(LibroMapper.class);
    @Mapping(surce = "id", target = "id")
    @Mapping(source = "titolo", target = "titolo")
    @Mapping(source = "genere", target = "genere")
    LibroDTO entityToDto(LibroEntity libroEntity);

    @Mapping(surce = "id", target = "id")
    @Mapping(source = "titolo", target = "titolo")
    @Mapping(source = "genere", target = "genere")
    LibroEntity dtoEntity(LibroDTO libroDTO);


}
