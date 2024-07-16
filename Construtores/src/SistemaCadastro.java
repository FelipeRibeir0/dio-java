public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "3948375");

        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
