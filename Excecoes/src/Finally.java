import java.util.Random;

/*
O bloco `finally` sempre é executado após o `try` e `catch`,
garantindo a liberação de recursos ou execução de ações
essenciais, independentemente de exceções.
*/

public class Finally {

    public static void main(String[] args) {

        boolean modoDebug = false;

        System.out.println("Modo debug inicial: " + modoDebug);

        try {
            modoDebug = true;
            System.out.println("Modo debug temporário: " + modoDebug);

            int resultado = executarOperacao();
            System.out.println("Resultado da operação: " + resultado);

        } catch (Exception e) {
            System.err.println("Erro durante a operação: " + e.getMessage());
        } finally {
            modoDebug = false;
            System.out.println("Modo debug restaurado: " + modoDebug);
        }

        System.out.println("Programa finalizado.");
    }

    public static int executarOperacao() throws Exception {
        Random random = new Random();
        int valor = random.nextInt(10);

        if (valor < 5) {
            throw new Exception("Valor muito baixo!");
        }

        return valor * 2;
    }
}