package Aula02;

import java.util.Scanner;

public class ExemploCirculo {
    public static void main(String[] args) {
        double raio, area;
        final double PI = 3.1416;

        System.out.println("Insira o valor do raio: ");
        Scanner scan = new Scanner(System.in);
        raio = scan.nextFloat();
        scan.close();
        
        area = PI * Math.pow(raio, 2);
        
        System.out.println("O valor da área é " + Double.toString(area));
    }
}
