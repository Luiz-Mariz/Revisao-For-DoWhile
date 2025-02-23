package For_DoWhile;

public class Exercicio38 {
    public static void main(String[] args) {


        int numero = 1;
        int cont = 1;

        System.out.println("Números pares de 1 a 20: ");
        do {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
            numero++;
            cont++;
        } while (cont <= 20);
    }
}
