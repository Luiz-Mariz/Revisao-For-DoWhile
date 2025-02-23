package For_DoWhile;

public class Exercicio24 {
    public static void main(String[] args) {

        System.out.println("Números triangulares até o décimo termo.");
        int calculo = 0;

        for (int i = 1; i <= 10; i++){
            calculo = (i *(i +1))/2;
            System.out.println(calculo);
        }
    }
}
