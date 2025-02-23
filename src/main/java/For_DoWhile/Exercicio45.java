package For_DoWhile;

import java.util.Scanner;


public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor máximo para a sequência de Fibonacci: ");
        int max = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: " + a);
        while (b <= max) {
            System.out.print(", " + b);
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println();
        scanner.close();
    }
}
