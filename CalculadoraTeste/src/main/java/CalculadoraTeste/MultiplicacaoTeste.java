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
    public void deveMultiplicarPorZero() {
        assertEquals(0.0, calc.multiplicar(999.0, 0.0), 0.001);
    }

    @Test
    public void deveMultiplicarNumeroPositivoPorNegativo() {
        assertEquals(-15.0, calc.multiplicar(3.0, -5.0), 0.001);
    }
}
