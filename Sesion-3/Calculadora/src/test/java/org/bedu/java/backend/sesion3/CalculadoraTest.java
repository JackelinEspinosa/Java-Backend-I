package org.bedu.java.backend.sesion3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;




@ExtendWith(MockitoExtension.class)
class CalculadoraTest {

    @Mock
    CalculadoraDao  CalculadoraDao;

    @InjectMocks
    Calculadora  Calculadora;

    @BeforeEach
    void setUp() {
        given(CalculadoraDao.findValorConstante()).willReturn (3);
    }

    @Test
    @DisplayName("Prueba suma")
    void  sumaTest(){
        int esperado = 5;
        assertEquals(esperado, Calculadora.suma(3, 2));
    }

    @Test
    @DisplayName("Prueba resta")
    void  restaTest(){
        int esperado = 1;
        assertEquals(esperado, Calculadora.resta(3, 2));
    }


    @Test
    @DisplayName("Prueba multiplicación")
    void  multiplicaTest(){
        int esperado = 6;
        assertEquals(esperado, Calculadora.multiplica(3, 2));
    }



/*
ejemplo uno
    private Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Prueba suma")
    void sumaTest() {
        int esperado = 5;

        assertEquals(esperado, calculadora.suma(3, 2));
    }
    @Test
    @DisplayName("Prueba resta")
    void restaTest() {
        int esperado = 1;

        assertEquals(esperado, calculadora.resta(3, 2));
    }

    @Test
    @DisplayName("Prueba multiplicacion")
    void multiplicaTest() {
        int esperado = 6;

        assertEquals(esperado, calculadora.multiplica(3, 2));
    }

    @Test
    @DisplayName("Prueba división")
    void divideTest() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.divide(100, 0), "No es posible dividir un valor entre 0");
    }*/
}
