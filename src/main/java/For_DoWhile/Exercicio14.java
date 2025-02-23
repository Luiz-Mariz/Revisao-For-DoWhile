package For_DoWhile;

public class Exercicio14 {
    public static void main(String[] args) {

        System.out.println("Os números primos entre 1 e 50");

        for (int i = 1; i <= 50; i++) {
            if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0)) {
                System.out.println(i);
            } else if (i == 2 || i == 3) {
                System.out.println(i);
            }
        }
    }
}
