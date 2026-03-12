package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraJava extends JFrame implements ActionListener {
    private JTextField visor;
    private double num1 = 0, num2 = 0, resultado = 0;
    private char operacao;


    public double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero");
        }
        return a / b;
    }

    //metodo utilitário para limpar o status
    public String limparStatus() {
        return "";
    }

    //a tela
    public CalculadoraJava() {
        // Configuração
        setTitle("Calculadora ");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setLayout(new BorderLayout());

        // Visor
        visor = new JTextField();
        visor.setFont(new Font("Arial", Font.BOLD, 24));
        visor.setHorizontalAlignment(JTextField.RIGHT);
        visor.setEditable(false);
        add(visor, BorderLayout.NORTH);

        // Painel de Botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(4, 4, 5, 5));

        String[] botoes = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.setFont(new Font("Arial", Font.PLAIN, 35));
            botao.addActionListener(this);
            painelBotoes.add(botao);
        }

        add(painelBotoes, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();


        if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9') {
            visor.setText(visor.getText() + comando);
        }

        else if (comando.equals("C")) {
            visor.setText(limparStatus()); // Usa o nosso método testável
            num1 = num2 = resultado = 0;
        }

        else if (comando.equals("=")) {
            if (visor.getText().isEmpty()) return;

            num2 = Double.parseDouble(visor.getText());

            try {
                switch (operacao) {
                    case '+': resultado = somar(num1, num2); break;
                    case '-': resultado = subtrair(num1, num2); break;
                    case '*': resultado = multiplicar(num1, num2); break;
                    case '/': resultado = dividir(num1, num2); break;
                }
                visor.setText(String.valueOf(resultado));
            } catch (ArithmeticException ex) {
                visor.setText("Erro");
            }
        }
        else {
            if (!visor.getText().isEmpty() && !visor.getText().equals("Erro")) {
                num1 = Double.parseDouble(visor.getText());
                operacao = comando.charAt(0);
                visor.setText("");
            }
        }
    }

    public static void main(String[] args) {
        CalculadoraJava calc = new CalculadoraJava();
        calc.setVisible(true);
    }
}