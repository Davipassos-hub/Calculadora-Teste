package CalculadoraTeste;

import org.example.CalculadoraJava;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubtracaoTeste {
    private CalculadoraJava calc;

    @BeforeEach
    public void preparar() {
        calc = new CalculadoraJava();
    }

    @Test
    public void deveSubtrairDoisNumerosPositivos() {
        assertEquals(5.0, calc.subtrair(15.0, 10.0), 0.001, "15 - 10 deve ser 5");
    }

    @Test
    public void deveSubtrairDoisNumerosPositivos1() {
        assertEquals(10.0, calc.subtrair(20.0, 10.0), 0.001, "20 - 10 deve ser 10");
    }

    @Test
    public void deveSubtrairDoisNumerosPositivos2() {
        assertEquals(20.0, calc.subtrair(30.0, 10.0), 0.001, "30 - 10 deve ser 20");
    }

    @Test
    public void deveSubtrairGerandoResultadoNegativo() {
        assertEquals(-10.0, calc.subtrair(10.0, 20.0), 0.001);
    }


    @Test
    public void deveSubtrairGerandoResultadoNegativo1() {
        assertEquals(-20.0, calc.subtrair(0.0, 20.0), 0.001);
    }

    @Test
    public void deveSubtrairGerandoResultadoNegativo2() {
        assertEquals(-40.0, calc.subtrair(10.0, 50.0), 0.001);
    }

    @Test
    public void deveSubtrairGerandoResultadoNegativo3() {
        assertEquals(-110.0, calc.subtrair(10.0, 120.0), 0.001);
    }

    @Test
    public void deveSubtrairNumeroNegativo() {
        assertEquals(15.0, calc.subtrair(10.0, -5.0), 0.001);
    }

    @Test
    public void deveSubtrairNumeroNegativo1() {
        assertEquals(20.0, calc.subtrair(10.0, -10.0), 0.001);
    }

    @Test
    public void deveSubtrairNumeroNegativo2() {
        assertEquals(40.0, calc.subtrair(10.0, -30.0), 0.001);
    }

    @Test
    public void deveSubtrairNumeroNegativo3() {
        assertEquals(90.0, calc.subtrair(10.0, -80.0), 0.001);
    }
}
