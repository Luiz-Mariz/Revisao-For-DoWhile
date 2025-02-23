package For_DoWhile;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;
        double soma = 0;
        do {
            System.out.print("Informe um numero: ");
            numero = sc.nextDouble();
            soma += numero;


        } while (numero != 0);
        System.out.println("O resultado da soma dos números informados é igual: " + soma);
        sc.close();
    }
}
