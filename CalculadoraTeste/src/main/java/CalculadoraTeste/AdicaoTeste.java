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
    public void deveSomarDoisNumerosPositivos1() {
        assertEquals(90.0, calc.somar(30.0, 60.0), 0.001, "30 + 60 deve ser 90");
    }

    @Test
    public void deveSomarDoisNumerosPositivos2() {
        assertEquals(654.0, calc.somar(326.0, 328.0), 0.001, "326 + 328 deve ser 654");
    }

    @Test
    public void deveSomarDoisNumerosPositivos3() {
        assertEquals(88.0, calc.somar(41.0, 47.0), 0.001, "41 + 47 deve ser 88");
    }


    @Test
    public void deveSomarComNumeroNegativo() {
        assertEquals(5.0, calc.somar(10.0, -5.0), 0.001, "10 + (-5) deve ser 5");
    }

    @Test
    public void deveSomarComNumeroNegativo1() {
        assertEquals(32.0, calc.somar(70.0, -38.0), 0.001, "70 + (-38) deve ser 32");
    }

    @Test
    public void deveSomarComNumeroNegativo2() {
        assertEquals(99.0, calc.somar(130.0, -31.0), 0.001, "130 + (-31) deve ser 99");
    }

    @Test
    public void deveSomarComNumeroNegativo3() {
        assertEquals(88.0, calc.somar(93.0, -5.0), 0.001, "93 + (-5) deve ser 88");
    }

    @Test
    public void deveSomarDoisNumerosNegativos() {
        assertEquals(-72.0, calc.somar(-36.0, -36.0), 0.001, "-36 + (-36) deve ser -72");
    }

    @Test
    public void deveSomarDoisNumerosNegativos1() {
        assertEquals(-100.0, calc.somar(-1.0, -99.0), 0.001, "-1 + (-99) deve ser -100");
    }

    @Test
    public void deveSomarDoisNumerosNegativos2() {
        assertEquals(-150.0, calc.somar(-75.0, -75.0), 0.001, "-75 + (-75) deve ser -150");
    }

    @Test
    public void deveSomarDoisNumerosNegativos3() {
        assertEquals(-190.0, calc.somar(-70.0, -120.0), 0.001, "-70 + (-120) deve ser -15");
    }

    // Questão 7) Escreva um teste para verificar se a calculadora resolve: 4 + 6 = 10.
    @Test
    public void testSomaSimples() {
        double resultado = calc.somar(4.0, 6.0);
        assertEquals(10.0, resultado);
    }
}