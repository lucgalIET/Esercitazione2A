package com.progettobiblioteca.biblioteca.mapper;
import com.progettobiblioteca.biblioteca.dto.PrestitoDTO;
import com.progettobiblioteca.biblioteca.entities.PrestitoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper
public interface PrestitoMapper {
    PrestitoEntity PRODOTTO_MAPPER = Mapper.getMapper(PrestitoEntity.class);
    @Mapping(source = "dataRitiro", target = "data_ritiro")
    @Mapping(source = "dataConsegna", target = "data_consegna")
    PrestitoDTO entityToDto(PrestitoEntity prodottoEntity);

    @Mapping(source = "dataRitiro", target = "data_ritiro")
    @Mapping(source = "dataConsegna", target = "data_consegna")
    PrestitoEntity dtoEntity(PrestitoDTO prodottoDTO);


}
