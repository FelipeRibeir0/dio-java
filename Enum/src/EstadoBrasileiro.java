public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo",1),
    RIO_JANEIRO ("RJ","Rio de Janeiro",2),
    PIAUI ("PI","Piauí",3),
    MARANHAO ("MA","Maranhão",4),
    CEARA ("CE","Ceará",5),
    MINAS_GERAIS ("MG","Minas Gerais",6),
    ESPIRITO_SANTO ("ES","Espirito Santo",7),
    RIO_GRANDE_DO_SUL ("RS","Rio de Grande do Sul",8),
    RIO_GRANDE_DO_NORTE ("RN","Rio de Grande do Norte",9),
    TOCANTINS ("TO","Tocantins",10),
    BAHIA("BA","Bahia",11);

    private String sigla;
    private String nome;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
    public int getIbge() {
        return ibge;
    }
}
