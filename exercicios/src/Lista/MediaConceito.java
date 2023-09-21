package Lista;

import javax.swing.JOptionPane;

public class MediaConceito {
    public static void main(String[] args) {
        double notap1 = 0, notap2 = 0, media = 0;
        char conceito = ' ';
        String msg = "";
        notap1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota parcial do aluno: "));
        notap2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota parcial do aluno: "));

        media = (notap1 + notap2) / 2;

        if (media >= 0 && media < 4) {
            conceito = 'E';
        } else if (media >= 4 && media < 6) {
            conceito = 'D';
        } else if (media >= 6 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 7.5 && media < 9) {
            conceito = 'B';
        } else if (media >= 9 && media <= 10) {
            conceito = 'A';
        }

        switch (conceito) {
            case 'A':
            case 'B':
            case 'C':
                msg = "APROVADO";
                break;
            case 'D':
            case 'E':
                msg = "REPROVADO";
                break;
        }

        if (conceito == ' ') {
            JOptionPane.showMessageDialog(null, "Média fora do intervalo!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Notas: " + notap1 + " (NP1), " + notap2 + " (NP2).\n" 
            + "Média: " + media + ".\n" + msg + "! Conceito: " + conceito + ".");
        }
    }
}
