package Lista;

import javax.swing.JOptionPane;

public class Maior3Numeros {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        if (num1 > num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "O maior número é " + num1 + ".");
        } else if (num2 > num1 && num2 > num3) {
            JOptionPane.showMessageDialog(null, "O maior número é " + num2 + ".");
        } else if (num3 > num1 && num3 > num2) {
            JOptionPane.showMessageDialog(null, "O maior número é " + num3 + ".");
        }
         else {
            JOptionPane.showMessageDialog(null, "Foram digitados números iguais!");
        }
    }
}
