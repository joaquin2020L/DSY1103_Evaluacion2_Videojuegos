package com.tienda.ordenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.ordenes.model.Orden;
import com.tienda.ordenes.service.OrdenService;

@RestController
@RequestMapping("/ordenes")
public class OrdenController {

    @Autowired
    private OrdenService service;

    @GetMapping
    public List<Orden> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public Orden crear(@RequestBody Orden orden) {
        return service.crearOrden(orden);
    }
}