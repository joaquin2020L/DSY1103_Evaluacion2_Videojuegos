package com.videojuegos.ms_soporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.videojuegos.ms_soporte.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}