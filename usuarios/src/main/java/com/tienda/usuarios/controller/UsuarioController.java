package com.tienda.usuarios.controller;

import com.tienda.usuarios.model.Usuario;
import com.tienda.usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/lista")
    public List<Usuario> obtenerUsuarios() {
        return usuarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerPorId(@PathVariable Long id) {
        return usuarioService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
        String token = usuarioService.login(email, password);
        if (token.contains("TOKEN")) {
            return ResponseEntity.ok("{\"token\": \"" + token + "\", \"status\": \"Autenticado\"}");
        }
        return ResponseEntity.status(401).body(token);
    }
}