package Aula03;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int x = 10, y = 5, z = 7, k = 7;
        System.out.println("Os operadores relacionais são usados para fazer comparacoes.");
        System.out.println("Quando o resultado da comparacão é VERDADEIRO, o retorno é true");
        System.out.println("Quando o resultado da comparacão é FALSO, o retorno é false");
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        System.out.println("Valor de z: " + z);
        System.out.println("Valor de k: " + k) ;

        System.out.print("Exemplo 1 (x > y): ");
        System.out.println(x > y);

        System.out.print("Exemplo 2 (x < y): ");
        System.out.println(x < y);

        System.out.print("Exemplo 3 (z == k): ");
        System.out.println(z == k);

        System.out.print("Exemplo 4 (z != k): ");
        System.out.println(z != k);

        System.out.print("Exemplo 5 (z >= k): ");
        System.out.println(z >= k);

        System.out.print("Exemplo 6 (z <= k): ");
        System.out.println(z <= k);
    }
}
