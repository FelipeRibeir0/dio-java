package Optional_Exemplos;

import java.util.Optional;

public class isPresent {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");

        // Output: Valor presente: Java
        optional.ifPresent(s -> System.out.println("Valor presente: " + s));

        if (optional.isPresent()) {
            System.out.println("Nenhum valor presente"); // Output: Nenhum valor presente
        }
    }
}
