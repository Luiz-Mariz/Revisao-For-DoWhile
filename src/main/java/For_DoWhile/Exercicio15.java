package For_DoWhile;

public class Exercicio15 {
    public static void main(String[] args) {

        System.out.println("Números de 1 a 100, substituindo múltiplos de 3 por (Fizz); e múltiplos de 5 por (Buzz)");

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
