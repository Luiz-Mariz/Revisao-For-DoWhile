package For_DoWhile;

public class Exercicio23 {
    public static void main(String[] args) {

        System.out.println("Números de 1 a 200 divisiveis por 4");

        for (int i = 1; i <= 200; i++){
            if (i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}
