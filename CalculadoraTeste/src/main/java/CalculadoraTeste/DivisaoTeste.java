package CalculadoraTeste;

import org.example.CalculadoraJava;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisaoTeste {
    private CalculadoraJava calc;

    @BeforeEach
    public void preparar() {
        calc = new CalculadoraJava();
    }

    @Test
    public void deveDividirDeFormaExata() {
        assertEquals(5.0, calc.dividir(10.0, 2.0), 0.001);
    }

    @Test
    public void deveDividirComResultadoDecimal() {
        assertEquals(2.5, calc.dividir(5.0, 2.0), 0.001);
    }

    @Test
    public void deveLancarErroAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10.0, 0.0);
        });
    }
}
