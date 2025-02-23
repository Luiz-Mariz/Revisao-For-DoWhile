package For_DoWhile;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Insira números: ");
        do {
            numero = sc.nextInt();
            if (numero > 0){
                System.out.println(numero);
            }
        } while (numero > 0);
    }
}
