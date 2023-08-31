package Aula03;

import javax.swing.JOptionPane;

public class ConversaoFahrenheitCelsius {
    public static void main(String[] args) {
        double tempF, tempC;

        tempF = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em °F:"));

        tempC = ((5 * (tempF - 32.0)) / 9.0);

        JOptionPane.showMessageDialog(null, "A temperatura " + tempF + "°F convertida "
                + "é igual a " + tempC + "°C.");
    }
}
