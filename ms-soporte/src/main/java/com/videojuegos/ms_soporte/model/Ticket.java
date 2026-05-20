package com.videojuegos.ms_soporte.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String asunto;
    private String estado;

    public Ticket() {}
    public Ticket(String asunto, String estado) {
        this.asunto = asunto;
        this.estado = estado;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getAsunto() { return asunto; }
    public void setAsunto(String asunto) { this.asunto = asunto; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}