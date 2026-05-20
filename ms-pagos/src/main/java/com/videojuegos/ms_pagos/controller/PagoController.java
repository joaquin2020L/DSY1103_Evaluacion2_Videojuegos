package com.videojuegos.ms_pagos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videojuegos.ms_pagos.model.Pago;
import com.videojuegos.ms_pagos.service.PagoService;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private PagoService pagoService;

    @GetMapping("/lista")
    public List<Pago> obtenerTodos() {
        return pagoService.listarTodos();
    }

    @PostMapping("/procesar")
    public Pago procesar(@RequestBody Pago pago) {
        pago.setEstado("Aprobado");
        return pagoService.guardar(pago);
    }
}