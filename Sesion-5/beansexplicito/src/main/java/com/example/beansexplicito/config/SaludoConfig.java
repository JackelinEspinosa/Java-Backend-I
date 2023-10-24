package com.example.beansexplicito.config;

import com.example.beansexplicito.model.Saludo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SaludoConfig {

    @Bean
    public Saludo saludo(){
        return new Saludo("Beto");
    }
}
