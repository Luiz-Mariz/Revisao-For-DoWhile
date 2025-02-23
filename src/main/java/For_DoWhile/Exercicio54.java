package For_DoWhile;

import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;
        do {

            System.out.print("Insira um número: ");
             numero = sc.nextDouble();
            System.out.println(Math.sqrt(numero));
        }while (numero > 0);
    }
}

