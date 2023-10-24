package com.example.beansexplicito;

import com.example.beansexplicito.model.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansexplicitoApplication  implements CommandLineRunner {

    //@Autowired forma uno no recomendada de inyectar beans
    private Saludo saludo;

    /*@Autowired  Segunda forma no recomendable por que permitimos que otra clase modifique la instancia
    public void setSaludo(Saludo saludo) {
        this.saludo = saludo;
    }*/


    public BeansexplicitoApplication(@Autowired Saludo saludo){
        this.saludo = saludo;
    }


    public static void main(String[] args) {
        SpringApplication.run(BeansexplicitoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(saludo.getNombre());
    }
}
