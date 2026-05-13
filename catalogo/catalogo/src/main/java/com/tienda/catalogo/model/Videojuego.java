package com.tienda.catalogo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data // Esto genera automáticamente los Getters y Setters (con Lombok)
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre del videojuego es obligatorio")
    private String nombre;

    @NotBlank(message = "La plataforma es obligatoria")
    private String plataforma;

    @Min(value = 0, message = "El precio no puede ser negativo")
    private Double precio;
}