package com.progettobiblioteca.biblioteca.entities;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autore")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AutoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @OneToMany(mappedBy = "idAutore")
    @JsonManagedReference
    private List<LibroEntity> libri = new ArrayList<>();
}
