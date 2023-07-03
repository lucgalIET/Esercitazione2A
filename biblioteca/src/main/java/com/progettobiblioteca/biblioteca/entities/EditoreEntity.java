package com.progettobiblioteca.biblioteca.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "editore")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EditoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "idEditore")
    @JsonManagedReference
    private List<LibroEntity> libri = new ArrayList<>();
}
