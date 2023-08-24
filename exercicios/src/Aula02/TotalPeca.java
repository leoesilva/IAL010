package Aula02;

import java.util.Scanner;

public class TotalPeca {
    public static void main(String[] args) {
        int codigo, quantidade;
        float valorUnit, valorTotal;

        System.out.println("Insira o código da peça: ");
        Scanner scan = new Scanner(System.in);
        codigo = scan.nextInt();
        System.out.println("Insira o valor unitário da peça: ");
        valorUnit = scan.nextFloat();
        System.out.println("Insira a quantidade da peça: ");
        quantidade = scan.nextInt();
        scan.close();

        valorTotal = quantidade * valorUnit;

        System.out.println("Cód. peça: " + Integer.toString(codigo) + ". Valor total: R$ " + Float.toString(valorTotal));
    }
}
