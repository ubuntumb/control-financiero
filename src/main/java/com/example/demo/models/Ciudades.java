package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "ciudades",
       uniqueConstraints = @UniqueConstraint(columnNames = "descripcion"))
@Data
public class Ciudades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad")
    private Integer id;

    // Relación con Departamentos
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_departamento", nullable = false)
    private Departamentos departamento;

    @NotBlank
    @Size(max = 80)
    @Column(name = "descripcion", nullable = false, length = 80)
    private String descripcion;
}
