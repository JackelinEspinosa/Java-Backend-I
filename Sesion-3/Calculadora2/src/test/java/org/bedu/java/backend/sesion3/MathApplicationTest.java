package org.bedu.java.backend.sesion3;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class MathApplicationTest {

    @Mock
    CalculadoraService calcService;

    @InjectMocks
    MathApplication mathApplication;

    @Test
    public void testAdd() {
        // Define el comportamiento del mock para el método add
        when(calcService.add(10.0, 20.0)).thenReturn(30.0);

        // Ejecuta el método add de mathApplication
        double result = mathApplication.add(10.0, 20.0);

        // Verifica que el resultado sea el esperado
        assertEquals(30.0, result, 0.0);

        // Verifica que el método add de calcService se haya invocado
        verify(calcService).add(10.0, 20.0);
    }
}