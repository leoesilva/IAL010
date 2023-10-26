package Desafio;

import java.lang.StringBuilder;
import javax.swing.JOptionPane;

public class Urna {
    public static void main(String[] args) {
        String nomeCand[] = { "Ricardo Nunes", "Vinícius Poit", "Tábata Amaral", "Kim Kataguiri",
                "Guilherme Boulos" };

        int qtdVotos[] = { 0, 0, 0, 0, 0 }, voto, votosInv = 0, totalVotos = 0, controle;
        StringBuilder listaCand = new StringBuilder();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < nomeCand.length; i++) {
            listaCand.append(i + " - " + nomeCand[i] + "\n");
        }

        do {
            controle = JOptionPane.showConfirmDialog(null, "Deseja seguir com a votação?", "Sistema de votação",
                    JOptionPane.YES_NO_OPTION);
            if (controle == JOptionPane.YES_OPTION) {
                voto = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Lista de candidatos: \n" + listaCand.toString() + "Digite o número do candidato.",
                        "Sistema de votação", JOptionPane.QUESTION_MESSAGE));
                totalVotos += 1;
                if ((voto >= 0) && voto < (nomeCand.length)) {
                    qtdVotos[voto] += 1;
                } else {
                    votosInv += 1;
                }
                JOptionPane.showMessageDialog(null, "Voto registrado!", "Sistema de Votação",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (controle == JOptionPane.NO_OPTION) {
                break;
            } else {
                System.exit(0);
            }

        } while (controle == JOptionPane.YES_OPTION);

        for (int i = 0; i < qtdVotos.length - 1; i++) {
            for (int j = 0; j < qtdVotos.length - i - 1; j++) {
                if (qtdVotos[j] < qtdVotos[j + 1]) {
                    int tempV = qtdVotos[j];
                    qtdVotos[j] = qtdVotos[j + 1];
                    qtdVotos[j + 1] = tempV;

                    String tempN = nomeCand[j];
                    nomeCand[j] = nomeCand[j + 1];
                    nomeCand[j + 1] = tempN;
                }
            }
        }

        for (int i = 0; i < nomeCand.length; i++) {
            resultado.append(i+1 + "º - " + nomeCand[i] + ": " + qtdVotos[i] + " voto(s).\n");
        }

        JOptionPane.showMessageDialog(null,
                "Resultado da eleição: \nTotal de votos: " + totalVotos + " voto(s).\n\n" + resultado.toString()
                        + "\nVoto(s) inválido(s): " + votosInv + ".",
                "Sistema de Votação", JOptionPane.INFORMATION_MESSAGE);
    }
}
