package com.tienda.ordenes.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "ordenes")
@Data
public class Orden {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long usuarioId;    // ID del usuario que compra
    private Long productoId;   // ID del producto comprado
    private Integer cantidad;
    private Double total;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion = new Date();
}