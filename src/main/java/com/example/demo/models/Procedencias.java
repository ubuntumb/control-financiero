package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Table(name = "procedencias")
@Data
public class Procedencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_procedencia")
    private Integer id;

    @NotNull(message = "La descripción es obligatoria")
    @Size(max = 100, message = "La descripción no puede exceder los 100 caracteres")
    @Column(name = "descripcion")
    private String descripcion;
}
