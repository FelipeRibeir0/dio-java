package Optional_Exemplos;

import java.util.Optional;

public class orElseGet {
    public static void main(String[] args) {
        // Simula uma busca por configuração que pode ser vazia
        Optional<String> configuracao = buscarConfiguracao();

        // Usa orElseGet para fornecer uma configuração padrão se a configuração não estiver presente
        String resultado = configuracao.orElseGet(() -> gerarConfiguracaoPadrao());
        System.out.println("Configuração: " + resultado);
    }

    private static Optional<String> buscarConfiguracao() {
        // Simula a ausência de configuração
        return Optional.empty();
    }

    private static String gerarConfiguracaoPadrao() {
        // Gera uma configuração padrão
        return "Configuração Padrão";
    }
}
