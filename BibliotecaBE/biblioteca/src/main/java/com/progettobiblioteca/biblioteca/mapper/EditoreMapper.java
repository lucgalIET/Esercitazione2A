package com.progettobiblioteca.biblioteca.mapper;
import com.progettobiblioteca.biblioteca.dto.EditoreDTO;
import com.progettobiblioteca.biblioteca.entities.EditoreEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EditoreMapper {

    EditoreMapper EDITORE_MAPPER = Mappers.getMapper(EditoreMapper.class);
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    EditoreDTO entityToDto(EditoreEntity editoreEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    EditoreEntity dtoEntity(EditoreDTO editoreDTO);

}
