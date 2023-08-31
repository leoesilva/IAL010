package Aula03;

import java.lang.Math;

import javax.swing.JOptionPane;

public class CalculaVolume {
    public static void main(String[] args) {
        final double PI = 3.1416;
        int raio = 0;
        double area = 0;

        raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do raio do círculo:"));

        area = PI * Math.pow(raio, 3);

        JOptionPane.showMessageDialog(null, "O volume da área é: " + area);

    }
}
