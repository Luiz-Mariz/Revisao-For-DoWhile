package For_DoWhile;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos números você deseja: ");
        int quat = sc.nextInt();

        int numero [] = new int[quat];


        for (int i = 0; i < quat; i++){
            numero[i] = sc.nextInt();

        }

        Arrays.sort(numero);
        for (int i = 0; i < quat; i++){
            System.out.println("Ordem cresente: " + numero[i]);
        }
        sc.close();
    }
}
