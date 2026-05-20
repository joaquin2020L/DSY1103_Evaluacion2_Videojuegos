package com.videojuegos.ms_resenas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videojuegos.ms_resenas.model.Resena;
import com.videojuegos.ms_resenas.service.ResenaService;

@RestController
@RequestMapping("/resenas")
public class ResenaController {
    @Autowired
    private ResenaService resenaService;

    @GetMapping("/juego/{juegoId}")
    public List<Resena> getResenas(@PathVariable Long juegoId) {
        return resenaService.buscarPorJuego(juegoId);
    }

    @PostMapping("/crear")
    public Resena crear(@RequestBody Resena resena) {
        return resenaService.guardar(resena);
    }
}