package com.tienda.ordenes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.ordenes.model.Orden;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long> {
}