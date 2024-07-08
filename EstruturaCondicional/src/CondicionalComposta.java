/*
Composta: Estrutura condicional que inclui um 'else'.
Se a condição no 'if' for verdadeira, o bloco de código dentro do 'if' será executado.
Se a condição no 'if' for falsa, o bloco de código dentro do 'else' será executado.
*/

public class CondicionalComposta {
    public static void main(String[] args) {
        int nota = 5;

        if(nota >= 6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
