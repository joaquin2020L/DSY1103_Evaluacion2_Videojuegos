package com.videojuegos.ms_resenas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.videojuegos.ms_resenas.model.Resena;
import com.videojuegos.ms_resenas.repository.ResenaRepository;

@Service
public class ResenaService {
    @Autowired
    private ResenaRepository resenaRepository;

    public List<Resena> buscarPorJuego(Long juegoId) {
        if (resenaRepository.count() == 0) {
            resenaRepository.save(new Resena(1L, "¡Tremendo juego! 10/10", "JoaquinL"));
            resenaRepository.save(new Resena(1L, "Tiene algunos bugs, pero la historia cumple", "JuanP"));
        }
        return resenaRepository.findByJuegoId(juegoId);
    }

    public Resena guardar(Resena resena) {
        return resenaRepository.save(resena);
    }
}