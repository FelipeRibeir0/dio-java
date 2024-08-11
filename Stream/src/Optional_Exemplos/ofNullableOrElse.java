package Optional_Exemplos;

import java.util.Optional;

public class ofNullableOrElse {
    public static void main(String[] args) {
        String nome = buscarNomeDeUsuario("Felipe");
        System.out.println(nome); // Output: Felipe

        nome = buscarNomeDeUsuario("Desconhecido");
        System.out.println(nome); // Output: Usuário não encontrado
    }

    public static String buscarNomeDeUsuario(String nome) {
        // Simula a busca de um nome que pode ou não existir
        return Optional.ofNullable(nome)
                .filter(n -> n.equals("Felipe"))
                .orElse("Usuário não encontrado");
    }
}
