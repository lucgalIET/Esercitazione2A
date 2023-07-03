package com.progettobiblioteca.biblioteca.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "prestito")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PrestitoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "data_ritiro")
    private String dataRitiro;

    @Column(name = "data_consegna")
    private String dataConsegna;

    @ManyToOne(targetEntity = LibroEntity.class)
    @JoinColumn(name = "id_libro")
    @JsonBackReference
    private LibroEntity idLibro;

    @ManyToOne(targetEntity = ClienteEntity.class)
    @JoinColumn(name = "id_cliente")
    @JsonBackReference
    private ClienteEntity idCliente;

}
