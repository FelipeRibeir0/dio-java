package mockitos_exemplos;

public class DadosLocalizacao {
    private String uf;
    private String cidade;
    private String bairro;
    private String complemento;
    private String logradouro;

    public DadosLocalizacao(String uf, String cidade, String bairro, String complemento, String logradouro) {
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.complemento = complemento;
        this.logradouro = logradouro;
    }

    public String getUf() {
        return uf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }
}
