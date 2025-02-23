package For_DoWhile;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);

        System.out.print("Por favor insira um número: ");
        double numero = sc.nextDouble();
        System.out.print("E divisor de " + numero + ": ");

        for (int i = 0; i < numero; i++){
            if (numero % i == 0){
                System.out.print(i + "  ");
            }
        }
        sc.close();
    }
}
