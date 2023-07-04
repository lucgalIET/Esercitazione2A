package com.progettobiblioteca.biblioteca.mapper;

import com.progettobiblioteca.biblioteca.dto.AutoreDTO;
import com.progettobiblioteca.biblioteca.entities.AutoreEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AutoreMapper {
    AutoreMapper AUTORE_MAPPER = Mapper.getMapper(AutoreMapper.class);
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "cognome", target = "cognome")
    AutoreDTO entityToDto(AutoreEntity autoreEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "cognome", target = "cognome")
    AutoreEntity dtoEntity(AutoreDTO autoreDTO);

}
