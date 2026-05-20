package com.videojuegos.ms_pagos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.videojuegos.ms_pagos.model.Pago;
import com.videojuegos.ms_pagos.repository.PagoRepository;

@Service
public class PagoService {
    @Autowired
    private PagoRepository pagoRepository;

    public List<Pago> listarTodos() {
        if (pagoRepository.count() == 0) {
            pagoRepository.save(new Pago(45990.0, "Webpay Transbank", "Aprobado"));
        }
        return pagoRepository.findAll();
    }

    public Pago guardar(Pago pago) {
        return pagoRepository.save(pago);
    }
}