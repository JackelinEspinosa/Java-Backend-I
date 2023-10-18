package org.bedu.java.backend.sesion3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSumaTest {

    static Calculadora calculadora;

    @BeforeAll  // Anotación que indica que el siguiente método se ejecutará antes de todas las pruebas en esta clase.
    static void setup() {  // Método que configura el entorno de prueba.
        calculadora = new Calculadora();  // Crea una instancia de la clase Calculadora antes de ejecutar las pruebas.
    }

    @Test
    @DisplayName("Prueba suma")
    void sumaTest() {
        int esperado = 5;
        assertEquals(esperado, calculadora.suma(3, 2));
    }

}
