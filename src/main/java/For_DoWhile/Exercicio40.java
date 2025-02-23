package For_DoWhile;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int quant = 0;

        System.out.println("Insira números: ");
        do {
            numero = sc.nextInt();
            if (numero != 0){
                quant++;
            }
        } while (numero != 0);
        System.out.println("A quantidade de números digitados antes do 0 é igual: " + quant);

        sc.close();
    }
}
