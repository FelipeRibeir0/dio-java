/*
Aninhada: Estrutura condicional onde um 'if' (ou 'else') contém outro 'if' dentro dele.
Isso permite verificar uma condição adicional apenas se a primeira condição for verdadeira (ou falsa, dependendo do caso).
*/

public class CondicionalAninhada {
    public static void main(String[] args) {
        int num = 25;

        if (num > 0) {
            System.out.println("O número é positivo.");
            if (num % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }
        } else {
            System.out.println("O número não é positivo.");
        }
    }
}
