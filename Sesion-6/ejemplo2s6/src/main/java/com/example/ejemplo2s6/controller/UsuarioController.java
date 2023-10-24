package com.example.ejemplo2s6.controller;

import com.example.ejemplo2s6.model.Direccion;
import com.example.ejemplo2s6.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @PostMapping
    public ResponseEntity<Usuario> creaUsuario(@RequestBody Usuario usuario) {
        System.out.println("Creando usuario");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Usuario: " + usuario.getUsuario());
        System.out.println("E-Mail: " + usuario.getCorreoElectronico());

        Direccion direccion = new Direccion();
        direccion.setCalle("Duitama");
        direccion.setNumero("56");
        direccion.setCodigoPostal("06700");

        usuario.setDireccion(direccion);

        return ResponseEntity.ok(usuario);
    }
}
