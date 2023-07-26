package com.progettobiblioteca.biblioteca.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PrestitoDTO {
    private Long id;
    private String dataRitiro;
    private String dataConsegna;


}
