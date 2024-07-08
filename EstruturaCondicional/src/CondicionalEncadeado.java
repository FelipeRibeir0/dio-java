/*
Encadeado: Uma estrutura condicional que utiliza 'else if' para verificar múltiplas condições em sequência.
Cada condição é avaliada apenas se a condição anterior (if ou else if) for falsa.
O bloco 'else' é executado apenas se todas as condições anteriores forem falsas.
*/
public class CondicionalEncadeado {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
