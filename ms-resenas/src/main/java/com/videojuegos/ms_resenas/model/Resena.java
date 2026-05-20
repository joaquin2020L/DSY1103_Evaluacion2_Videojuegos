package com.videojuegos.ms_resenas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "resenas")
public class Resena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long juegoId;
    private String comentario;
    private String usuario;

    public Resena() {}
    public Resena(Long juegoId, String comentario, String usuario) {
        this.juegoId = juegoId;
        this.comentario = comentario;
        this.usuario = usuario;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getJuegoId() { return juegoId; }
    public void setJuegoId(Long juegoId) { this.juegoId = juegoId; }
    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
}