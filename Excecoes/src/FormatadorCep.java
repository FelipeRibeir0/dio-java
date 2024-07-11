public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23796994");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O Cep não corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{

        if (cep.length() != 8)
            throw new CepInvalidoException();

        StringBuilder cepFormatado = new StringBuilder(cep);
        cepFormatado.insert(2, '.').insert(6, '-');

        return cepFormatado.toString();
    }
}

