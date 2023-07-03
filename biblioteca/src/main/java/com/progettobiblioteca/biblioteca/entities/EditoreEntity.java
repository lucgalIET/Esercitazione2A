package com.progettobiblioteca.biblioteca.entities;

import jakarta.persistence.*;
import lombok.*;

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
}
