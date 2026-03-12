/*
 * ATIVIDADE - TESTES UNITÁRIOS COM CALCULADORA
 * RESPOSTAS TEÓRICAS E MAPEAMENTO
 *
 * Parte 1 — Compreendendo o que é um teste
 *
 * 1) O que significa testar uma função em programação?
 * Resposta: Significa testar na prática se o código que escrevemos realmente
 * faz o que promete. A gente passa um dado de entrada e vê se a saída bate
 * com o esperado. É basicamente automatizar a "prova real" para garantir que
 * o programa não tem bugs lógicos.
 *
 * 2) Se uma função recebe a expressão '2+3', qual resultado você espera que ela retorne?
 * Resposta: A gente espera que ela resolva a conta e devolva o valor correto, que é 5.
 *
 * 3) Se quisermos verificar automaticamente se o resultado está correto, qual comando
 * podemos usar?
 * Resposta: No Java, usando a biblioteca JUnit, a gente usa o método assertEquals().
 * Ele serve para dizer ao código: "verifica se o resultado que deu aqui é igual ao
 * que eu estou esperando".
 *
 * 4) Complete a instrução abaixo para verificar se o resultado é 5:
 * Resposta: assertEquals(5.0, calc.somar(2.0, 3.0));
 *
 * -------------------------------------------------------------------------
 * Parte 2 e 3 — Estrutura de um teste e Operações Básicas
 *
 * 5) Todo teste unitário possui tres partes principais. Quais sao elas
 * Resposta: A gente costuma dividir em três passos (o padrão AAA): Preparar o
 * cenário (Arrange), Executar a ação de fato (Act) e Verificar o resultado (Assert).
 *
 * 6) Observe o código abaixo e identifique qual parte corresponde a Cenário,
 * Execução e Verificação:
 * Resposta:
 * expressao = '3*5' -> CENÁRIO (preparando as variáveis)
 * resultado = calcular_expressao(expressao) -> EXECUÇÃO (rodando a função)
 * self.assertEqual(resultado, '15') -> VERIFICAÇÃO (conferindo se deu certo)
 *
 * Questão 7: [Respondida em código - Teste de Soma]
 * Questão 8: [Respondida em código - Teste de Subtração]
 * Questão 9: [Respondida em código - Teste de Multiplicação]
 * Questão 10: [Respondida em código - Teste de Divisão]
 *
 * -------------------------------------------------------------------------
 * Parte 4 — Pensamento crítico
 *
 * 11) O que deveria acontecer se o usuário tentar dividir um número por zero?
 * Resposta: O programa não pode simplesmente "crashar" e fechar do nada. O ideal
 * é que ele bloqueie essa operação e lance um erro claro (como uma ArithmeticException).
 *
 * Questão 12: [Respondida em código - Teste de Divisão por zero]
 *
 * 13) O que deveria acontecer se o usuário digitar algo que não é uma expressão
 * matemática válida? Exemplo: 'abc'.
 * Resposta: A função deve rejeitar a entrada logo de cara, devolvendo um erro.
 * [Nota sobre o meu código]: Como a minha calculadora usa métodos separados e tipados
 * (recebendo double), se alguém tentar passar 'abc', o próprio Java barra na hora de
 * compilar, então o texto inválido nem chega na conta.
 *
 * Questão 14: [Respondida/Justificada na nota da questão 13]
 *
 * -------------------------------------------------------------------------
 * Parte 5 — Raciocínio mais avançado e Reflexão
 *
 * 15) A calculadora deve respeitar a precedência matemática. Qual deve ser o
 * resultado da expressão: 2 + 3 * 4?
 * Resposta: Tem que dar 14. Pela regra da matemática, a multiplicação (3 * 4 = 12)
 * acontece primeiro, e só depois soma com o 2.
 * [Nota sobre o meu código]: Na minha implementação de métodos separados, a precedência
 * e os parênteses são garantidos pela ordem exata em que eu chamo as funções dentro
 * dos testes.
 *
 * Questão 16: [Respondida em código - Teste de Precedência Matemática]
 * Questão 17: [Respondida em código - Teste de Precedência com Parênteses]
 *
 * 18) Se a interface gráfica da calculadora mudar, os testes da função
 * precisam ser alterados? Por quê?
 * Resposta: Não precisa mudar nada. Os testes unitários servem para testar o "cérebro"
 * da calculadora (o backend). Se o formato dos botões ou as cores da tela mudarem,
 * a matemática por trás continua sendo a mesma.
 *
 * 19) Como você poderia testar várias expressões diferentes usando apenas um único
 *  de teste?
 * Resposta: Dá para usar Testes Parametrizados.
 * Com ele, a gente passa uma lista com vários valores de entrada e os resultados
 * que esperamos. Aí, o JUnit roda aquele mesmo teste várias vezes automaticamente.
 */