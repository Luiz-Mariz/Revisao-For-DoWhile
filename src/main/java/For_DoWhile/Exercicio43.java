package For_DoWhile;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular a soma dos dígitos: ");
        int numero = scanner.nextInt();
        int soma = 0;

        int temp = Math.abs(numero);
        do {
            soma += temp % 10;
            temp /= 10;
        } while (temp > 0);

        System.out.println("A soma dos dígitos é: " + soma);
        scanner.close();
    }
}
