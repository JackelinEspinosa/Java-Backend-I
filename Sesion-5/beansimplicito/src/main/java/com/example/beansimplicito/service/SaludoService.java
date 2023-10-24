package com.example.beansimplicito.service;

import com.example.beansimplicito.model.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    private final Saludo saludo;

    @Autowired
    public SaludoService(Saludo saludo) {
        this.saludo = saludo;
    }

    public String saluda(){
        return "Hola " + saludo.getNombre();
    }
}
