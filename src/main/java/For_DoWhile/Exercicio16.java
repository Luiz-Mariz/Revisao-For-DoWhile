package For_DoWhile;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = sc.next();


        for (int i = 0; i < palavra.length(); i++){
            System.out.println(palavra.charAt(i));

        }
        sc.close();
    }
}
