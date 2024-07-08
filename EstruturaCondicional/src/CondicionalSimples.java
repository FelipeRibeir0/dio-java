/*
Simples: Apenas uma condição usando 'if'.
Se a condição for verdadeira, o bloco de código dentro do 'if' será executado.
Se a condição for falsa, o bloco de código dentro do 'if' será ignorado.
*/

public class CondicionalSimples {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;

            System.out.println(saldo);
        }
    }
}