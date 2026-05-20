package com.tienda.usuarios.service;

import com.tienda.usuarios.model.Usuario;
import com.tienda.usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarTodos() {
        if (usuarioRepository.count() == 0) {
            usuarioRepository.save(new Usuario("Joaquin Admin", "joaquin@admin.com", "$2a$10$EncryptedPassAdmin", "ADMIN"));
            usuarioRepository.save(new Usuario("Juan Cliente", "juan@cliente.com", "$2a$10$EncryptedPassClient", "CLIENTE"));
        }
        return usuarioRepository.findAll();
    }

    public String login(String email, String password) {
        if ("joaquin@admin.com".equals(email)) {
            return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.TOKEN_SIMULADO_ADMIN_ROL";
        } else if ("juan@cliente.com".equals(email)) {
            return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.TOKEN_SIMULADO_CLIENTE_ROL";
        }
        return "Credenciales inválidas";
    }

    public Optional<Usuario> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }
}