package com.tienda.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.inventario.model.Inventario;
import com.tienda.inventario.repository.InventarioRepository;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public List<Inventario> listarTodo() {
        return inventarioRepository.findAll();
    }

    public Inventario guardar(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    public Inventario buscarPorVideojuego(Long id) {
        return inventarioRepository.findByVideojuegoId(id).orElse(null);
    }
}