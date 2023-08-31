package Aula03;

import javax.swing.JOptionPane;

public class CalculaMediaSimples {
    public static void main(String[] args) {
        double nota1 = 0, nota2 = 0, media = 0;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno:"));

        media = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, "A média simples das notas do aluno é: " + media);
    }
}
