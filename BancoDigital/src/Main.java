import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente felipe = new Cliente();
        felipe.setNome("Felipe C Ribeiro");

        Conta corrente = new ContaCorrente(felipe);
        Conta poupanca = new ContaPoupanca(felipe);

        corrente.depositar(100);
        corrente.transferir(poupanca,59);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        Banco banco = new Banco(Arrays.asList(corrente, poupanca));
        banco.setNome("Claro Bank");
        System.out.println("\nContas cadastradas no "+ banco.getNome());


        banco.listarContas();
    }
}
