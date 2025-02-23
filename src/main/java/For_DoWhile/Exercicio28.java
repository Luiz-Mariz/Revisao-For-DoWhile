package For_DoWhile;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos números você deseja somar: ");
        int quat = sc.nextInt();

        int numero [] = new int[quat];
        int soma = 0;

        for (int i = 0; i < quat; i++){
            System.out.printf("%nInsira o %d° valor: ", i + 1);
            numero[i] = sc.nextInt();
            soma += numero[i];
        }
        int media = soma / quat;
        System.out.println("O resultado da media é igual: " + media);

        sc.close();

    }
}
