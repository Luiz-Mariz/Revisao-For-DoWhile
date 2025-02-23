package For_DoWhile;

public class Exercicio36 {
    public static void main(String[] args) {

        int soma = 0;
        int cont = 1;

        do {
            soma += cont;
            cont++;
        } while (cont <= 50);

        System.out.println("A soma de todos os números de 1 a 50 é igual: " + soma);
    }
}
