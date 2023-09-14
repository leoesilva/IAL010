package Lista;

import javax.swing.JOptionPane;

public class PositivoNegativo {
    public static void main(String[] args) {
        double valor = 0;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor: "));

        if (valor == 0) {
            JOptionPane.showMessageDialog(null, "O valor " + valor + " é neutro.");
        } else if (valor < 0) {
            JOptionPane.showMessageDialog(null, "O valor " + valor + " é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O valor " + valor + " é positivo.");
        }
    }
}
