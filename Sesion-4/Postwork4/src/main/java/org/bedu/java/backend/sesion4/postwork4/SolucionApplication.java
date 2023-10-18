package org.bedu.java.backend.sesion4.postwork4;

import org.bedu.java.backend.sesion4.postwork4.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

// Anotación que marca la clase como una aplicación Spring Boot
@SpringBootApplication
public class SolucionApplication implements CommandLineRunner {

	// Método principal de la aplicación
	public static void main(String[] args) {
		SpringApplication.run(SolucionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);

		// Solicita al usuario que ingrese el nombre y espera una entrada
		System.out.println("Introduce el nombre: ");
		String nombre = reader.nextLine();

		// Crea una nueva instancia de la clase Persona usando los valores ingresados
		System.out.println("Introduce el teléfono: ");
		String telefono = reader.nextLine();

		Persona persona = new Persona(nombre, telefono);

		// Imprime la información de la persona en la consola
		System.out.println(persona);
	}
}
