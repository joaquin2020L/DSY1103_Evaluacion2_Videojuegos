package com.videojuegos.ms_envios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "envios")
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoSeguimiento;
    private String estado;
    private String empresa;

    public Envio() {}
    public Envio(String codigoSeguimiento, String estado, String empresa) {
        this.codigoSeguimiento = codigoSeguimiento;
        this.estado = estado;
        this.empresa = empresa;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCodigoSeguimiento() { return codigoSeguimiento; }
    public void setCodigoSeguimiento(String codigoSeguimiento) { this.codigoSeguimiento = codigoSeguimiento; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }
}