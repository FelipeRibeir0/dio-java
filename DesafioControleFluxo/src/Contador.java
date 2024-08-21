import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int paramUm = terminal.nextInt();

        System.out.println("Agora digite o segundo parâmetro: ");
        int paramDois = terminal.nextInt();

        try{
            contar(paramUm, paramDois);
        }
        catch (ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException {
        if(paramUm > paramDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = paramDois - paramUm;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " +i);
        }

    }
}
    class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException (String message) {
            super(message);
        }
}