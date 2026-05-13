package com.tienda.inventario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.inventario.model.Inventario;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Long> {
    
    // Este método es extra: nos permite buscar el stock de un juego específico
    Optional<Inventario> findByVideojuegoId(Long videojuegoId);
}