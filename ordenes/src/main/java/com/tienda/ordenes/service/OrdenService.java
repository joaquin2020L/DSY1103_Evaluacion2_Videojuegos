package com.tienda.ordenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.ordenes.model.Orden;
import com.tienda.ordenes.repository.OrdenRepository;

@Service
public class OrdenService {
    
    @Autowired
    private OrdenRepository repository;

    public List<Orden> listarTodas() {
        return repository.findAll();
    }

    public Orden crearOrden(Orden orden) {
        return repository.save(orden);
    }
}