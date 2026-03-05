package CalculadoraTeste;

import org.example.CalculadoraJava;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Status {
    private CalculadoraJava calc;

    @BeforeEach
    public void preparar() {
        calc = new CalculadoraJava();
    }

    @Test
    public void deveLimparOStatusDaCalculadora() {
        String statusAtual = calc.limparStatus();

        assertEquals("", statusAtual, "O utilitário de limpeza deve retornar vazio.");
    }
}