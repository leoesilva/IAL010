package Aula03;

import javax.swing.JOptionPane;

public class CalculaMediaPonderada {
    public static void main(String[] args) {
        final double peso1 = 2.5, peso2 = 4.5;

        double nota1 = 0, nota2 = 0, media = 0;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno:"));

        media = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);

        JOptionPane.showMessageDialog(null, "A média ponderada das notas do aluno é: " + media);
    }
}
