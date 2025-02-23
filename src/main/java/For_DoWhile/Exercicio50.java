package For_DoWhile;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua senha: ");
        String senha = sc.next();
        String senhaVerificacao = "";

        do {
            System.out.print("Insira novamente: ");
            senhaVerificacao = sc.next();
        }while (!senha.equals(senhaVerificacao));

        System.out.println("Parabêns você acertou sua senha");
    }
}
