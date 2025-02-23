package For_DoWhile;

public class Exercicio51 {
    public static void main(String[] args) {

        System.out.println("10 primeiros números perfeitos: ");

        /* Codigo lento pois os numeros perfeitos são muito grandes então o calculo demora
        para aconter
         */

        int cont = 0;
        int numero = 1;
        int somaNumero = 0;

       do {
           somaNumero = 0;

           for (int i = 1; i <= numero / 2; i++){
               if (numero % i == 0){
                   somaNumero += i;
               }
           }

           if (numero == somaNumero){
               System.out.println(numero);
               cont++;
           }

           numero++;
       }while (cont <= 10);
    }
}
