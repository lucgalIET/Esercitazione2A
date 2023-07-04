package com.progettobiblioteca.biblioteca.mapper;

import com.progettobiblioteca.biblioteca.dto.ClienteDTO;
import com.progettobiblioteca.biblioteca.entities.ClienteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper
public interface ClienteMapper {
    ClienteMapper CLIENTE_MAPPER = Mapper.getMapper(ClienteMapper.class);
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "cognome", target = "cognome")
    ClienteDTO entityToDto(ClienteEntity autoreEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "cognome", target = "cognome")
    ClienteEntity dtoEntity(ClienteDTO autoreDTO);
}
