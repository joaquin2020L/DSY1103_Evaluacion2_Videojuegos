package com.tienda.inventario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Este es el ID del videojuego que está en el otro microservicio
    private Long videojuegoId; 
    
    private Integer cantidad;
    private String bodega;

    public Inventario() {}

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getVideojuegoId() { return videojuegoId; }
    public void setVideojuegoId(Long videojuegoId) { this.videojuegoId = videojuegoId; }

    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }

    public String getBodega() { return bodega; }
    public void setBodega(String bodega) { this.bodega = bodega; }
}