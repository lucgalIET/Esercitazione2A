package com.progettobiblioteca.biblioteca.dto;

import com.progettobiblioteca.biblioteca.entities.AutoreEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LibroDTO {
    private String titolo;
    private List<AutoreDTO> autori;
    private EditoreDTO idEditore;
    private String genere;
}
