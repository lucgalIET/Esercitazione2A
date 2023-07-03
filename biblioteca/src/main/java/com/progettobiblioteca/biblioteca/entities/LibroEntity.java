package com.progettobiblioteca.biblioteca.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "libro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class LibroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "genere")
    private String genere;

    @ManyToOne(targetEntity = AutoreEntity.class)
    @JoinColumn(name = "id_autore")
    @JsonBackReference
    private AutoreEntity idAutore;

    @ManyToOne(targetEntity = EditoreEntity.class)
    @JoinColumn(name = "id_editore")
    @JsonBackReference
    private EditoreEntity idEditore;

    @OneToMany(mappedBy = "idLibro")
    @JsonManagedReference
    private List<PrestitoEntity> prestiti = new ArrayList<>();
}
