package For_DoWhile;

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número para saber se ele e primo: ");
        double numero = sc.nextDouble();

        int cont = 1;
        int testadorPrimo = 0;
        do {
            if (numero % cont == 0){
                testadorPrimo++;
            }
            cont++;
        }while (cont <= numero);

        if (testadorPrimo == 2){
            System.out.println("O seu número e considerado primo");
        }
        else {
            System.out.println("O seu número não é cosiderado primo");
        }
        sc.close();
    }
}
