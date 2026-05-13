package com.tienda.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.inventario.model.Inventario;
import com.tienda.inventario.service.InventarioService;

@RestController
@RequestMapping("/api/inventario") // Esta es la URL base
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    // GET para ver todo el inventario
    @GetMapping
    public List<Inventario> obtenerTodo() {
        return inventarioService.listarTodo();
    }

    // GET para ver el stock de un juego específico
    @GetMapping("/juego/{id}")
    public Inventario obtenerPorJuego(@PathVariable Long id) {
        return inventarioService.buscarPorVideojuego(id);
    }

    // POST para agregar o actualizar stock
    @PostMapping
    public Inventario guardar(@RequestBody Inventario inventario) {
        return inventarioService.guardar(inventario);
    }
}