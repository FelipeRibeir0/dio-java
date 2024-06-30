import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Nesse projeto estarei anotando todos os tipos de variáveis que o Java usa

        byte idade = 127; // Um valor que esteja entre -128 e 127, ele utilize 1 byte de memória
        short ano = 2024; // Um valor que esteja entre -32.768 e 32.767, ele utilize 2 byte de memória
        int populacao = 2147483647; // Um valor que esteja entre -2.147.483.648 e 2.147.483.647, ele utilize 4 bytes de memória
        long dividaNacional = 1234567890123456789L; // Um valor que esteja entre -9223372036854775808L e 9223372036854775807L, ele usa 8 bytes de memória.

        // Tipos primitivos com partes fracionárias(número quebrado):

        float distanciaEstrelas = 3.4028235e+38f; // Um valor que esteja entre 1.4E-45 e 3.4028235E38, ele usa 4 bytes de memória
        double pibPais = 1.7976931348623157e+308; // Um valor que esteja entre 4.9E-324 e 1.7976931348623157E308, ele usa 8 bytes de memória

        System.out.println("Você pode acessar esses limites positivos e negativos utilizando Tipo.MAX_VALUE e Tipo.MIN_VALUE");

        /* O tipo double e o tipo integer são os mais comúns devido aos computadores modernos não necessitarem essa atenção especial com o uso de memória
        Geralmente não trabalhamos com números gigantes para usar o long, e o float somente mantém sua precisão decimal entre 6 e 7 números*/

        // Essa é uma string, uma mensagem que você ou o usuário escreve. Pode ser uma palavra, nome ou texto
        final String AVISO = "Esse aviso não pode ser mudado, ele é uma constante!";
        System.out.println(AVISO.concat(" (Ele usa 'final' como palavra chave para ter um valor inalterável)"));

        // Esse é um char, um character, uma letra única, que vai ser a 1ª letra do aviso

        char letra = AVISO.charAt(0);
        System.out.println(letra);

        // Um valor booleano, ele é 0 ou 1, false ou true.

        boolean avisoFoiExibido = true;

        // Uma data, como o nome sugere

        Date Hoje = new Date();

        System.out.println(Hoje);
    }
}