package CalculadoraTeste;

import org.example.CalculadoraJava;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicacaoTeste {
    private CalculadoraJava calc;

    @BeforeEach
    public void preparar() {
        calc = new CalculadoraJava();
    }

    @Test
    public void deveMultiplicarDoisNumerosPositivos() {
        assertEquals(50.0, calc.multiplicar(10.0, 5.0), 0.001);
    }

    @Test
    public void deveMultiplicarDoisNumerosPositivos1() {
        assertEquals(100.0, calc.multiplicar(10.0, 10.0), 0.001);
    }

    @Test
    public void deveMultiplicarDoisNumerosPositivos2() {
        assertEquals(21.0, calc.multiplicar(7.0, 3.0), 0.001);
    }

    @Test
    public void deveMultiplicarDoisNumerosPositivos3() {
        assertEquals(30.0, calc.multiplicar(6.0, 5.0), 0.001);
    }
    @Test
    public void deveMultiplicarPorZero() {
        assertEquals(0.0, calc.multiplicar(999.0, 0.0), 0.001);
    }

    @Test
    public void deveMultiplicarPorZero1() {
        assertEquals(0.0, calc.multiplicar(45543.0, 0.0), 0.001);
    }

    @Test
    public void deveMultiplicarPorZero2() {
        assertEquals(0.0, calc.multiplicar(3030.0, 0.0), 0.001);
    }

    @Test
    public void deveMultiplicarPorZero3() {
        assertEquals(0.0, calc.multiplicar(5454.0, 0.0), 0.001);
    }

    @Test
    public void deveMultiplicarNumeroPositivoPorNegativo() {
        assertEquals(-15.0, calc.multiplicar(3.0, -5.0), 0.001);
    }

    @Test
    public void deveMultiplicarNumeroPositivoPorNegativo1() {
        assertEquals(-40.0, calc.multiplicar(8.0, -5.0), 0.001);
    }

    @Test
    public void deveMultiplicarNumeroPositivoPorNegativo2() {
        assertEquals(-90.0, calc.multiplicar(18.0, -5.0), 0.001);
    }

    @Test
    public void deveMultiplicarNumeroPositivoPorNegativo3() {
        assertEquals(-32.0, calc.multiplicar(8.0, -4.0), 0.001);
    }
}
