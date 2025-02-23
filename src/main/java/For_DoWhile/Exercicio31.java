package For_DoWhile;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;
        do {
            System.out.print("Informe um numero: ");
            numero = sc.nextDouble();

        } while (numero >= 0);

        sc.close();
    }
}
