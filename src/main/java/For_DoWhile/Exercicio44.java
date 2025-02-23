package For_DoWhile;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = sc.nextInt();
        int cont = 1;

        System.out.println("Numeros divisores de " + numero +": ");
        do {
            if (numero % cont == 0){
                System.out.print(cont + " ");
            }

            cont++;
        }while (cont < numero);

        sc.close();
    }
}
