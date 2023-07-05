package com.progettobiblioteca.biblioteca.dto;

import com.progettobiblioteca.biblioteca.entities.AutoreEntity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AutoreDTO {
    private Long id;
    private String nome;
    private String cognome;

}
