package Optional_Exemplos;

import java.util.Optional;

public class ofGet {
    public static void main(String[] args) {
        Optional<String> opcional = Optional.of("Java");

        if (opcional.isPresent()) {
            String valor = opcional.get();
            System.out.println("Valor presente: " + valor); // Output: Valor presente: Java
        }
    }
}