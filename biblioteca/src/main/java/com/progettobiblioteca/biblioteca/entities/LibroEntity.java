package com.progettobiblioteca.biblioteca.entities;


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

    @ManyToMany
    @JoinTable(
            name = "autore_libro",
            joinColumns = @JoinColumn(name = "id_libro"),
            inverseJoinColumns = @JoinColumn(name = "id_autore")
    )
    @JsonManagedReference
    private List<AutoreEntity> autori;

    @ManyToOne(targetEntity = EditoreEntity.class)
    @JoinColumn(name = "id_editore")
    @JsonManagedReference
    private EditoreEntity idEditore;

    @OneToMany(mappedBy = "idLibro")
    @JsonManagedReference
    private List<PrestitoEntity> prestiti = new ArrayList<>();
}
