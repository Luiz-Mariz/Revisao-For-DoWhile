package For_DoWhile;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        String palavra = sc.next();

        int cont = 1;
        int caracteres = 1;

        do {
            caracteres++;
            cont++;
        }while (cont != palavra.length());

        System.out.println("Quantidades de caracteres da palavra: " + caracteres);

        sc.close();
    }
}
