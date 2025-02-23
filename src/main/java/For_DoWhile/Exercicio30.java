package For_DoWhile;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos números você deseja informar: ");
        int quat = sc.nextInt();

        int numero [] = new int[quat];
        int par = 0;
        int impar = 0;

        for (int i = 0; i < quat; i++){
            numero[i] = sc.nextInt();

        }

        for (int i = 0; i < quat; i++){
            if (numero[i] % 2 == 0){
                par += 1;
            }
            else {
                impar += 1;
            }
        }
        System.out.printf("A quantidade de números par é igual: %d%nA quantidade de números impares é igual: %d", par,impar);
        sc.close();
    }
}
