package For_DoWhile;

public class Exercicio52 {
    public static void main(String[] args) {

        System.out.println("Primeiros 10 números primos:");

        int numero = 1;
        int cont = 0;
        int somaPrimos = 0;

        do {
            somaPrimos = 0;


            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0){
                    somaPrimos++;
                }
            }



            if (somaPrimos == 2){
                System.out.println(numero);
                cont++;
            }


            numero++;
        }while (cont < 10);
    }
}
