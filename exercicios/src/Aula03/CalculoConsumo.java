package Aula03;

import javax.swing.JOptionPane;

public class CalculoConsumo {
    public static void main(String[] args) {
        double distancia = 0, consumo = 0, media = 0;

        distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida em km: "));
        consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de combustível usada em l: "));

        media = distancia / consumo;

        JOptionPane.showMessageDialog(null, "A média de consumo foi de: " + media + "km/l");
    }
}
