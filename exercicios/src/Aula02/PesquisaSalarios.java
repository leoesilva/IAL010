package Aula02;

import javax.swing.*;

public class PesquisaSalarios {
    public static void main(String[] args) {
        String nome, sexo;
        int idade, qtdHomem = 0, qtdMulher = 0;
        float salario, total = 0;
        for(int i = 0; i < 5; i++) {
            nome = JOptionPane.showInputDialog("Digite o seu nome: ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
            sexo = JOptionPane.showInputDialog("Digite o seu sexo (M ou F): ");
            salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu salário: "));
            if (Character.toUpperCase(sexo.charAt(0)) == 'M') {
                qtdHomem += 1;
            }
            if (Character.toUpperCase(sexo.charAt(0)) == 'F') {
                qtdMulher += 1;
            }
            total += salario;
        }
        JOptionPane.showMessageDialog(null, "Quantidade de homens: " + qtdHomem + "\nQuantidade de mulheres: " + qtdMulher + "\nSoma dos salários: R$ " + total);
    }
}
