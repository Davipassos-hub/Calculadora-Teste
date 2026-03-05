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
        assertEquals(1.0, calc.dividir(10.0, 10.0), 0.001);
    }

    @Test
    public void deveDividirDeFormaExata1() {
        assertEquals(5.0, calc.dividir(10.0, 2.0), 0.001);
    }

    @Test
    public void deveDividirDeFormaExata2() {
        assertEquals(75.0, calc.dividir(150.0, 2.0), 0.001);
    }

    @Test
    public void deveDividirDeFormaExata3() {
        assertEquals(82.0, calc.dividir(164.0, 2.0), 0.001);
    }


    @Test
    public void deveDividirComResultadoDecimal() {
        assertEquals(2.5, calc.dividir(5.0, 2.0), 0.001);
    }

    @Test
    public void deveDividirComResultadoDecimal1() {
        assertEquals(12.5, calc.dividir(25.0, 2.0), 0.001);
    }

    @Test
    public void deveDividirComResultadoDecimal2() {
        assertEquals(9.5, calc.dividir(19.0, 2.0), 0.001);
    }

    @Test
    public void deveDividirComResultadoDecimal3() {
        assertEquals(7.5, calc.dividir(15.0, 2.0), 0.001);
    }

    @Test
    public void deveLancarErroAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10.0, 0.0);
        });
    }
}
