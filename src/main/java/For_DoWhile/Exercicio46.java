package For_DoWhile;

import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = sc.nextInt();
        int multiplos = 0;
        int cont = 1;

        System.out.println("Dez primeiros multiplos " + numero +": ");
        do {
            if (numero % cont == 0){
                System.out.print(cont + " ");
                multiplos++;
            }
            cont++;
        }while (multiplos < 10);
    }
}
