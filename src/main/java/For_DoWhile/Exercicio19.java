package For_DoWhile;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número para saber seu fatorial: ");
        double numero = sc.nextDouble();
        double fatorial = 1;

        for (double i = numero; i > 1; i--){
            fatorial *= i;
        }
        System.out.printf("O fatorial de %.2f = %.2f ", numero, fatorial);
        sc.close();
    }
}
