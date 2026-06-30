package com.tienda.usuarios.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.tienda.usuarios.model.Usuario;
import com.tienda.usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/usuarios")
@Tag(name = "Gestión de Usuarios y Roles", description = "Endpoints para la autenticación y registro de clientes en GameStore")
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
@Operation(summary = "Registrar un nuevo usuario", description = "Crea un cliente en el sistema asignándole un rol por defecto.")
    @ApiResponse(responseCode = "201", description = "Usuario creado con éxito")
    @ApiResponse(responseCode = "400", description = "Error en las validaciones o el correo ya existe")
    @PostMapping("/login")
    
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
        String token = usuarioService.login(email, password);
        if (token.contains("TOKEN")) {
            return ResponseEntity.ok("{\"token\": \"" + token + "\", \"status\": \"Autenticado\"}");
        }
        return ResponseEntity.status(401).body(token);
    }
}