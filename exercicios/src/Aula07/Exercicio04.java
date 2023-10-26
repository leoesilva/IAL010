package Aula07;

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int val[] = { 3, 5, 6, 8, 10 }, soma = 0;
        StringBuilder strVal = new StringBuilder();
        for (int i = 0; i < val.length; i++) {
            strVal.append(val[i] + "\n");
            if ((val[i] % 2) != 0) {
                soma+=val[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Valores: \n" + strVal.toString() + "A soma dos valores ímpares do vetor é igual a " + soma + ".");
    }
}
