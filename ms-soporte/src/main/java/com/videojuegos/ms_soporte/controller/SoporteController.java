package com.videojuegos.ms_soporte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videojuegos.ms_soporte.model.Ticket;
import com.videojuegos.ms_soporte.service.TicketService;

@RestController
@RequestMapping("/soporte")
public class SoporteController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/lista")
    public List<Ticket> obtenerTodos() {
        return ticketService.listarTodos();
    }

    @PostMapping("/crear")
    public Ticket crear(@RequestBody Ticket ticket) {
        ticket.setEstado("Abierto");
        return ticketService.guardar(ticket);
    }
}