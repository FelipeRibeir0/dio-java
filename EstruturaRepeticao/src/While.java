/*

While: Executa um bloco de código enquanto uma condição seja verdadeira, que nesse caso é a mesada ser maior do que 0.

*/


import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0){
            double valorDoce = valorAleatorio();

            if(valorDoce > mesada){
                break;
            }

            System.out.println("Doce do valor: "+ valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Só sobrou R$"+mesada+ " da mesada do Joãozinho");
    }

    private static Double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
