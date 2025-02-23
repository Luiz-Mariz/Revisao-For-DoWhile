package For_DoWhile;

public class Exercicio25 {
    public static void main(String[] args) {

        System.out.println("Triângulo com altura 5.");
        String asterisco = "*****";

        for (int i = 0; i <6 ; i++){
            for (int j = 0; j < i; j++){
                System.out.print(asterisco.charAt(j));
            }
            System.out.println(" ");
        }
    }

}
