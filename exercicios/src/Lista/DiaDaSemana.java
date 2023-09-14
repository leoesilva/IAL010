package Lista;

import javax.swing.JOptionPane;

public class DiaDaSemana {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o dia da semana (de 1 a 7):"));

        switch (numero) {
            case 1:
                JOptionPane.showMessageDialog(null, "Dia da semana: domingo.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Dia da semana: segunda-feira.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Dia da semana: terça.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Dia da semana: quarta.");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Dia da semana: quinta.");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Dia da semana: sexta.");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Dia da semana: sábado.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}
