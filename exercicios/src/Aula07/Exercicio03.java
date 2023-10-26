package Aula07;

import java.lang.StringBuilder;
import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        int num[] = new int[10];
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<10;i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
            if((num[i] % 2) == 0) {
                num[i]*=10;
            }
            else {
                num[i]+=5;
            }
            res.append("Posição " + i + ": " + num[i] + "\n");
        }
        JOptionPane.showMessageDialog(null, "Valores armazenados:\n" + res);
    }
}
