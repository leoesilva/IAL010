package Lista;

import javax.swing.JOptionPane;

public class MediaDistincao {
    public static void main(String[] args) {
        double notap1 = 0, notap2 = 0, media = 0;
        notap1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota parcial do aluno: "));
        notap2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota parcial do aluno: "));

        media = (notap1 + notap2) / 2;

        if (media >= 0 && media < 7) {
            JOptionPane.showMessageDialog(null, "Média " + media + ". Aluno reprovado!");
        } else if (media >= 7 && media < 10) {
            JOptionPane.showMessageDialog(null, "Média " + media + ". Aluno aprovado!");
        } else if (media == 10) {
            JOptionPane.showMessageDialog(null, "Média " + media + ". Aluno aprovado com distinção!");
        } else {
            JOptionPane.showMessageDialog(null, "Média " + media + ". Valor(es) inválido(s)!");
        }
    }
}