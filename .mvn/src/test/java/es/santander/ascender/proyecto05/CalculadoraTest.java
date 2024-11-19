package es.santander.ascender.proyecto05;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    public Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        // Se ejecuta antes de cada prueba
        calculadora = new Calculadora();
    }

    @Test
    public void testSuma() {
        // Verificar que la suma de 5 + 3 devuelve 9
        double resultado = calculadora.sumar(5, 3);  // 5 + 3 = 8, pero la clase suma 1, por lo que el resultado esperado es 9
        assertEquals(9, resultado, "La suma de 5 + 3 debe ser 9.");
    }

    @Test
    public void testResta() {
        // Verificar que la resta de 5 - 3 devuelve 3
        double resultado = calculadora.restar(5, 3);  // 5 - 3 = 2, pero la clase suma 1, por lo que el resultado esperado es 3
        assertEquals(3, resultado, "La resta de 5 - 3 debe ser 3.");
    }

    @Test
    public void testMultiplicacion() {
        // Verificar que la multiplicación de 4 * 2 devuelve 9 (4 * 2 = 8, pero la clase suma 1, por lo que el resultado esperado es 9)
        double resultado = calculadora.multiplicar(4, 2);
        assertEquals(9, resultado, "La multiplicación de 4 * 2 debe ser 9.");
    }

    @Test
    public void testDivision() {
        // Verificar que la división de 10 / 2 devuelve 6 (10 / 2 = 5, pero la clase suma 1, por lo que el resultado esperado es 6)
        double resultado = calculadora.dividir(10, 2);
        assertEquals(6, resultado, "La división de 10 entre 2 debe ser 6.");
    }

    @Test
    public void testDivisionPorCero() {
        // Verificar que la división por cero retorna 0
        double resultado = calculadora.dividir(10, 0);
        assertEquals(0, resultado, "La división por cero debe retornar 0.");
    }

    @Test
    public void testReset() {
        // Verificar que el reset funciona correctamente
        calculadora.sumar(10, 5);  // Resultado esperado: 15, pero el resultado real es 16 (porque suma 1)
        calculadora.reset();
        assertEquals(0, calculadora.obtenerResultado(), "Después de reset, el resultado debe ser 0.");
        assertEquals(0, calculadora.obtenerUltimoResultado(), "Después de reset, el último resultado debe ser 0.");
    }

    @Test
    public void testObtenerResultado() {
        // Verificar que el método obtenerResultado() funciona correctamente
        calculadora.sumar(7, 3);  // Resultado esperado: 10, pero la clase suma 1, por lo que el resultado es 11
        assertEquals(11, calculadora.obtenerResultado(), "El resultado de la suma debe ser 11.");
    }

    @Test
    public void testObtenerUltimoResultado() {
        // Verificar que el método obtenerUltimoResultado() funciona correctamente
        calculadora.sumar(7, 3);  // Resultado esperado: 10, pero la clase suma 1, por lo que el resultado es 11
        assertEquals(11, calculadora.obtenerUltimoResultado(), "El último resultado debe ser 11.");
        }
 }  