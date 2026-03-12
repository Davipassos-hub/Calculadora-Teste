package CalculadoraTeste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.CalculadoraJava; // Importando a sua calculadora

public class PrecedenciaTeste {

    CalculadoraJava calc = new CalculadoraJava();

    // Questão 16) Escreva um teste que valide a precedência matemática: 2 + 3 * 4 = 14.
    @Test
    public void testPrecedenciaMatematica() {
        double resultadoMultiplicacao = calc.multiplicar(3.0, 4.0);
        double resultadoFinal = calc.somar(2.0, resultadoMultiplicacao);

        assertEquals(14.0, resultadoFinal);
    }

    // Questão 17) Teste uma expressão com parênteses: (2 + 3) * 4 = 20.
    @Test
    public void testPrecedenciaComParenteses() {
        double resultadoSoma = calc.somar(2.0, 3.0); // 2 + 3 = 5
        double resultadoFinal = calc.multiplicar(resultadoSoma, 4.0); // 5 * 4 = 20
        assertEquals(20.0, resultadoFinal);
    }
}