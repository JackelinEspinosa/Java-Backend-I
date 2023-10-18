package org.bedu.java.backend.sesion3;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStreamInJava8() {
        Calculadora calculadora = new Calculadora();
        List<Integer> entradas = IntStream.range(0, 1000).boxed().toList();
        List<Integer> resultados = IntStream.range(0, 1000).map(i -> entradas.get(i) * 2).boxed().toList();

        return IntStream.range(0, 1000)
                .mapToObj(numero -> DynamicTest.dynamicTest("multiplicando: " + numero,
                        () -> {
                            assertEquals(calculadora.multiplica(entradas.get(numero), 2), resultados.get(numero));
                        }));
    }
}
