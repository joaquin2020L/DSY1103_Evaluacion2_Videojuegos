package com.videojuegos.ms_soporte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.videojuegos.ms_soporte.model.Ticket;
import com.videojuegos.ms_soporte.repository.TicketRepository;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> listarTodos() {
        if (ticketRepository.count() == 0) {
            ticketRepository.save(new Ticket("Problema con la descarga del juego", "Abierto"));
        }
        return ticketRepository.findAll();
    }

    public Ticket guardar(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}