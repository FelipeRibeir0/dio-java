package mockitos_exemplos;

public class Mensagem {
    private String conteudo;

    public Mensagem(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}