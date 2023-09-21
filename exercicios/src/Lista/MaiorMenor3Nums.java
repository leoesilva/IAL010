package Lista;

import javax.swing.JOptionPane;

public class MaiorMenor3Nums {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0, maior = 0, menor = 0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        if ((num1 == num2) || (num2 == num3) || (num1 == num3)) {
            JOptionPane.showMessageDialog(null, "Foram digitados números iguais!");
        } else {
            if (num1 > num2 && num1 > num3) {
                maior = num1;
            } else if (num2 > num1 && num2 > num3) {
                maior = num2;
            } else {
                maior = num3;
            }

            if (num1 < num2 && num1 < num3) {
                menor = num1;
            } else if (num2 < num1 && num2 < num3) {
                menor = num2;
            } else {
                menor = num3;
            }
            JOptionPane.showMessageDialog(null, "O maior número é " + maior
                    + ".\nO menor número é " + menor + ".");
        }
    }
}