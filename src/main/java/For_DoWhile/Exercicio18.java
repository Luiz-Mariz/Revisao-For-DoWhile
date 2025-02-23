package For_DoWhile;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe algo para sabaer se é considerado palíndromo: ");
        String palavra = sc.next();
        String palavraReversa = "";

        for (int i = palavra.length() -1; i >= 0; i--){
            palavraReversa += palavra.charAt(i);
        }

        if (palavra.equals(palavraReversa)){
            System.out.println("Isso e considerado palíndromo");
        }
        else {
            System.out.println("Isso não é considerado um palíndromo.");
        }
        sc.close();

    }
}
