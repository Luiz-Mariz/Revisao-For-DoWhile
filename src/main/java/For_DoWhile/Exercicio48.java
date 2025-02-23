package For_DoWhile;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira números para saber se ele e considerado par ou impar: ");
        double numero = 0;

        do {
            numero = sc.nextDouble();
            if (numero % 2 == 0){
                System.out.print("Número par");
            }
            else {
                System.out.print("Número impar");
            }
            System.out.println(" ");
        }while (numero != 0);
        sc.close();
    }
}
