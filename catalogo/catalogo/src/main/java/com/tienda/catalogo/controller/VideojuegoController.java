package com.tienda.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.catalogo.model.Videojuego;
import com.tienda.catalogo.service.VideojuegoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/videojuegos")
public class VideojuegoController {

    @Autowired
    private VideojuegoService service;

    // Obtener todos los juegos
    @GetMapping
    public List<Videojuego> listar() {
        return service.listarTodos();
    }

    // Crear un nuevo juego
    @PostMapping
    public ResponseEntity<Videojuego> crear(@Valid @RequestBody Videojuego juego) {
        return ResponseEntity.ok(service.guardar(juego));
    }
}