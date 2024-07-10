/*

Do While: Executa um bloco de código enquanto uma condição é verdadeira, mas garantindo que o código será executado pelo menos 1 vez.

*/

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            System.out.println("Telefone tocando");
        }while(Tocando());

        System.out.println("Alô!!");
    }
    private static boolean Tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
