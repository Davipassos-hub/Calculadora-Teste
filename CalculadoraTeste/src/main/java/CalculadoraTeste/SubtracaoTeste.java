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
    public void deveSubtrairGerandoResultadoNegativo() {
        assertEquals(-10.0, calc.subtrair(10.0, 20.0), 0.001);
    }

    @Test
    public void deveSubtrairNumeroNegativo() {
        assertEquals(15.0, calc.subtrair(10.0, -5.0), 0.001);
    }
}
