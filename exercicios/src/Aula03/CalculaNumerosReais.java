package Aula03;

import javax.swing.*;

public class CalculaNumerosReais {
    public static void main(String[] args) {
        double valor1 = 91.37, valor2 = 7.351, res_soma, res_mult;
        res_soma = valor1 + valor2;
        res_mult = valor1 * valor2;

        JOptionPane.showMessageDialog(null, "Valor 1: " + valor1
        + "\nValor 2: " + valor2
        + "\nResultado da soma dos valores: " + res_soma
        + "\nResultado da multiplicacão dos valores: " + res_mult);
    }
}
