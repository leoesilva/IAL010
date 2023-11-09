package Aula13;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][4];
        int contador = 0;
        StringBuilder matriz = new StringBuilder();
        StringBuilder impares = new StringBuilder();
        StringBuilder exibeimpares = new StringBuilder();
        matriz.append("Matriz preenchida:\n");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog("Insira o elemento " + (i + 1) + ", " + (j + 1) + " da matriz:"));
                matriz.append("\t \t \t \t " + numeros[i][j] + " \t \t \t \t ");
                if (numeros[i][j] % 2 != 0) {
                    contador += 1;
                    impares.append(numeros[i][j] + "\t \t \t ");
                }
            }
            matriz.append("\n");
        }
        exibeimpares.append("São " + contador + " número(s) ímpar(es).\n");
        exibeimpares.append("Número(s): " + impares);

        JOptionPane.showMessageDialog(null, matriz.toString() + exibeimpares.toString());
    }
}