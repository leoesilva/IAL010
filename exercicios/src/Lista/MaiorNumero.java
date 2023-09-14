package Lista;

import javax.swing.JOptionPane;

/**
 * MaiorNumero
 */
public class MaiorNumero {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O maior número é " + num1 + ".");
        } else if (num1 < num2) {
            JOptionPane.showMessageDialog(null, "O maior número é " + num2 + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Foram digitados números iguais!");
        }
    }
}
