package For_DoWhile;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base do losango: ");
        int base = scanner.nextInt();
        scanner.close();

        if (base % 2 == 0) {
            System.out.println("A base deve ser um número ímpar.");
            return;
        }

        int mid = base / 2;

        // Parte superior do losango
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
