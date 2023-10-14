package Desafio;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Urna {
    public static void main(String[] args) {
        final String[] nomeCand = { "Ricardo Nunes", "Vinícius Poit", "Tábata Amaral", "Kim Kataguiri",
                "Guilherme Boulos" };
        String listaCand = "";
        Integer[] votosCand = { 0, 0, 0, 0, 0 };
        Integer[] idxs = new Integer[nomeCand.length];
        int votosInvalidos = 0;
        int voto;
        char ctrlVoto = 'V';
        for (int i = 0; i < nomeCand.length; i++) {
            listaCand += idxs[i] + " - " + nomeCand[i] + "\n";
        }

        do {
            ctrlVoto = JOptionPane.showInputDialog("Digite \"V\" para votar ou \"E\" para encerrar:").charAt(0);
            if (ctrlVoto == 'V') {
                voto = Integer.parseInt(JOptionPane.showInputDialog(
                        "Lista de candidatos: \n" + listaCand + "Para votar, digite o número do seu candidato:"));
                if (voto < votosCand.length) {
                    for (int i = 0; i < nomeCand.length; i++) {
                        if (voto == idxs[i]) {
                            votosCand[i] += 1;
                        }
                    }
                } else {
                    votosInvalidos += 1;
                }
            } else if (ctrlVoto == 'E') {
                String res = "";
                for (int i = 0; i < nomeCand.length; i++) {
                    res += nomeCand[i] + " - " + votosCand[i] + " voto(s).\n";
                }
                JOptionPane.showMessageDialog(null, "Resultado: \n" + res + "Votos inválidos: " + votosInvalidos + ".");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (ctrlVoto == 'V');
    }
}