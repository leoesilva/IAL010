package Lista;

import javax.swing.JOptionPane;

public class SaudacaoTurno {
    public static void main(String[] args) {
        char turno;

        turno = Character.toUpperCase(JOptionPane
                .showInputDialog(null, "Digite o seu turno (M - Matutino, V - Vespertino, N - Noturno):").charAt(0));

        switch (turno) {
            case 'M':
                JOptionPane.showMessageDialog(null, "Bom dia!");
                break;
            case 'V':
                JOptionPane.showMessageDialog(null, "Boa tarde!");
                break;
            case 'N':
                JOptionPane.showMessageDialog(null, "Boa noite!");
                break;
            default: 
                JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
    }
}