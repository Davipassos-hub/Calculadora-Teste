package CalculadoraTeste;

import org.example.CalculadoraJava;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdicaoTeste {
    private CalculadoraJava calc;

    @BeforeEach
    public void preparar() {
        calc = new CalculadoraJava();
    }

    @Test
    public void deveSomarDoisNumerosPositivos() {
        assertEquals(15.0, calc.somar(10.0, 5.0), 0.001, "10 + 5 deve ser 15");
    }

    @Test
    public void deveSomarComNumeroNegativo() {
        assertEquals(5.0, calc.somar(10.0, -5.0), 0.001, "10 + (-5) deve ser 5");
    }

    @Test
    public void deveSomarDoisNumerosNegativos() {
        assertEquals(-15.0, calc.somar(-10.0, -5.0), 0.001, "-10 + (-5) deve ser -15");
    }
}