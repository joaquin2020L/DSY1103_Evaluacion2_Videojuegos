package com.videojuegos.ms_envios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videojuegos.ms_envios.model.Envio;
import com.videojuegos.ms_envios.service.EnvioService;

@RestController
@RequestMapping("/envios")
public class EnvioController {
    @Autowired
    private EnvioService envioService;

    @GetMapping("/lista")
    public List<Envio> obtenerTodos() {
        return envioService.listarTodos();
    }

    @PostMapping("/crear")
    public Envio crear(@RequestBody Envio envio) {
        return envioService.guardar(envio);
    }
}