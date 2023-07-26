package com.progettobiblioteca.biblioteca.mapper;

import com.progettobiblioteca.biblioteca.dto.AutoreDTO;
import com.progettobiblioteca.biblioteca.entities.AutoreEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoreMapper {
    AutoreMapper AUTORE_MAPPER = Mappers.getMapper(AutoreMapper.class);
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "cognome", target = "cognome")
    AutoreDTO entityToDto(AutoreEntity autoreEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "cognome", target = "cognome")
    AutoreEntity dtoEntity(AutoreDTO autoreDTO);

}
