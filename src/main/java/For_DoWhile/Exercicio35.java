package For_DoWhile;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para saber sua tabuada: ");
        double numero = sc.nextDouble();
        int cont = 0;

        do {
            double calculo = numero * cont;
            System.out.printf("%.2f * %d = %.2f%n", numero,cont,calculo);
            cont++;
        }while (cont <= 10);

        sc.close();

    }
}
