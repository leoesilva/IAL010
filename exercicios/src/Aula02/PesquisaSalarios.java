package Aula02;

import javax.swing.*;

public class PesquisaSalarios {
    public static void main(String[] args) {
        String nome;
        char sexo;
        int idade, qtdHomem = 0, qtdMulher = 0, qtdEntrevistados = 0;
        float salario, total = 0;
        for(int i = 0; i < 5; i++) {
            nome = JOptionPane.showInputDialog("Digite o seu nome: ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
            sexo = Character.toUpperCase(JOptionPane.showInputDialog("Digite o seu sexo (M ou F): ").charAt(0));
            salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu salário: "));
            if (sexo == 'M') {
                qtdHomem += 1;
                qtdEntrevistados += 1;
            }
            else if (sexo == 'F') {
                qtdMulher += 1;
                qtdEntrevistados += 1;
            }
            else {
                qtdEntrevistados += 1;
            }
            total += salario;                        
        }
        JOptionPane.showMessageDialog(null, "Quantidade de homens: " + qtdHomem 
        + "\nQuantidade de mulheres: " + qtdMulher 
        + "\nQuantidade de entrevistados: " + qtdEntrevistados
        + "\nSoma dos salários: R$ " + total);
    }
}
