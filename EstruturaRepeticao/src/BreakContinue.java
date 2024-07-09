public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                continue;
                // O Continue retornará para o começo do For caso o i seja par, imprimindo apenas os números ímpares.
            }
            System.out.println(i);
        }
        System.out.println("======");
        for (int i = 0; i < 20; i++) {
            if (i > 10) {
                break;
                // O Break encerrará o ciclo do For mesmo que a condição seja terminar em 20, por causa da condição ser maior que 10 no If
            }
            System.out.println(i);
        }
    }
}