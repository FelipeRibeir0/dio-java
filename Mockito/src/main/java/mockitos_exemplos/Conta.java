package mockitos_exemplos;

public class Conta {

    private int saldo;

    public Conta(int saldo) {this.saldo = saldo;}

    public void pagaBoleto(int valorAPagar){
        validaSaldo(valorAPagar);
        debita(valorAPagar);
        enviaCreditoParaEmissor(valorAPagar);
    }

    public void validaSaldo(int valorAPagar){
        if (saldo < valorAPagar){
            throw new IllegalStateException("Saldo insuficiente");
        }
    }

    public void debita(int valorAPagar){ this.saldo -= valorAPagar;}

    public void enviaCreditoParaEmissor(int valorAPagar){
        //Envia valor para emissor do boleto
    }
}