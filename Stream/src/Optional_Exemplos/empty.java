package Optional_Exemplos;

import java.util.Optional;

public class empty {
    public static void main(String[] args) {
        Optional<String> vazio = Optional.empty();
        System.out.println(vazio.orElse("Valor padrão")); // Output: Valor padrão
    }
}
