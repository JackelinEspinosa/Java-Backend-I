package com.example.iniprop.service;

import com.example.iniprop.model.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class SaludoService {

    private final Saludo saludo;

    @Autowired
    public SaludoService(Saludo saludo) {
        this.saludo = saludo;
    }

    @PostConstruct
    public void  init(){
        saludo.setNombre("Beto");
    }

    public String saluda(){
        return "Hola " + saludo.getNombre();
    }
}
