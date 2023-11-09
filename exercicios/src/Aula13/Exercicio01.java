package Aula13;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];
        int soma = 0;
        StringBuilder matriz = new StringBuilder();
        String somares;
        matriz.append("Matriz preenchida:\n");
        
        for(int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira o elemento " + (i+1) + ", " + (j+1) + " da matriz:"));
                matriz.append("\t \t \t \t " + numeros[i][j] + " \t \t \t \t ");
                if (i == j) {
                    soma += numeros[i][j];
                }
            }
            matriz.append("\n");
        }
        somares = "A soma da diagonal da matriz é igual a " + soma + ".";
        JOptionPane.showMessageDialog(null, matriz.toString() + somares);
    }
}
