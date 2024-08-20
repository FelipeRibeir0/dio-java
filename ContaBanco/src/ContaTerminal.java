import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo ao banco Claro!");

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Qual a sua agência de preferência?");
        agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        numero = scanner.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma " +
                "conta em nosso banco, sua agência é %s, conta %s e " +
                "seu saldo R$ %s já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
