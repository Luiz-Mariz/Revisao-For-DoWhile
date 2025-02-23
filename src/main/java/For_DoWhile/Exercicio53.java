package For_DoWhile;

public class Exercicio53 {
    public static void main(String[] args) {
        int n = 1, term = 1;

        System.out.print("Sequência de números triangulares: ");

        do {
            System.out.print(term + " ");
            n++;
            term = n * (n + 1) / 2;
        } while (n <= 10);

        System.out.println();
    }
}
