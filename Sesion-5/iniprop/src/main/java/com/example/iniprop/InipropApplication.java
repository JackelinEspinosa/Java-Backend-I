package com.example.iniprop;

import com.example.iniprop.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InipropApplication implements CommandLineRunner {


    private final SaludoService saludoService;

    public InipropApplication(@Autowired SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(InipropApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(saludoService.saluda());
    }
}

