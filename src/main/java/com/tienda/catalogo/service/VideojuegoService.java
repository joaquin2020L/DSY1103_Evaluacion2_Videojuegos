package com.tienda.catalogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.catalogo.model.Videojuego;
import com.tienda.catalogo.repository.VideojuegoRepository;

@Service
public class VideojuegoService {

    @Autowired
    private VideojuegoRepository repo;

    // Método para obtener todos los videojuegos
    public List<Videojuego> listarTodos() {
        return repo.findAll();
    }

    // Método para guardar un videojuego con lógica de negocio
    public Videojuego guardar(Videojuego juego) {
        // Ejemplo de regla de negocio: No permitimos juegos con precio 0 si son "Premium"
        if (juego.getPrecio() == null || juego.getPrecio() < 0) {
            throw new RuntimeException("El precio debe ser válido");
        }
        return repo.save(juego);
    }
}