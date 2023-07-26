package com.progettobiblioteca.biblioteca.mapper;
import com.progettobiblioteca.biblioteca.dto.PrestitoDTO;
import com.progettobiblioteca.biblioteca.entities.PrestitoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PrestitoMapper {
    PrestitoMapper PRESTITO_MAPPER = Mappers.getMapper(PrestitoMapper.class);
    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataRitiro", target = "dataRitiro")
    @Mapping(source = "dataConsegna", target = "dataConsegna")
    PrestitoDTO entityToDto(PrestitoEntity prodottoEntity);

    @Mapping(source = "dataRitiro", target = "dataRitiro")
    @Mapping(source = "dataConsegna", target = "dataConsegna")
    PrestitoEntity dtoEntity(PrestitoDTO prodottoDTO);


}
