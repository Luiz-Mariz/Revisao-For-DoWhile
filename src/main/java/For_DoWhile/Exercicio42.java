package For_DoWhile;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        String palavra = sc.nextLine();

        int cont = palavra.length();
        do {
            System.out.print(palavra.charAt(cont -1));
            cont--;
        }while (cont > 0);

        sc.close();
    }
}
