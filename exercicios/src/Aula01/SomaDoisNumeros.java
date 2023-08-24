package Aula01;

import javax.swing.*;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        String vlr1, vlr2, res; // Variáveis de texto para receber os valores dos inputs
        float num1 = 0, num2 = 0, soma = 0; // Variáveis numéricas para as operações matemáticas

        //  Recebendo os valores dos inputs e convertendo para tipos numéricos
        vlr1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
        vlr2 = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
        num1 = Float.parseFloat(vlr1);
        num2 = Float.parseFloat(vlr2);

        //  Realizando a operação de soma e convertendo o resultado para texto
        soma = num1 + num2;
        res = Float.toString(soma);

        //  Exibindo o resultado
        JOptionPane.showMessageDialog(null, "O resultado da soma é " + res);
    }
}
