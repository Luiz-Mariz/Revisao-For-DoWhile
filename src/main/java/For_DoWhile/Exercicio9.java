package For_DoWhile;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero que você deseja saber a tabuada: ");
        Double numero = sc.nextDouble();

        for (int i = 0; i <= 10; i++){
            System.out.printf("%.2f * %d = %.2f%n", numero, i, numero * i);
        }
    }
}
