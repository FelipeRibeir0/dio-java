public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{ " +
                "Cliente = '" + cliente.getNome() + '\'' +
                ", Saldo = " + saldo +
                '}';
    }

    @Override
    public void sacar(double valor) {
    this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
    this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
    this.sacar(valor);
    contaDestino.depositar(valor);
    }

    protected void imprimirInfos(){
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Agência: %d\n", this.getAgencia());
        System.out.printf("Conta: %d\n", this.getNumero());
        System.out.printf("Saldo: R$ %.2f\n", this.getSaldo());
    }

}
