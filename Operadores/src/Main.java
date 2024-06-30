//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     // Operadores aritméticos

     int soma = 4 + 2;
     double subtracao = 6.3 - 2.7;
     double multiplicacao = 2.5 * 2.2;
     int divisao = 16 / 6;
     int modulo = 16 % 6;
     String concat = "4" + "4"; //"4" + "4" será "44" porque só juntou os textos, não foi pedido uma soma para resultar em 8

    System.out.println("Soma: " + soma);
    System.out.println("Subtracao: " + subtracao);
    System.out.println("Multiplicacao: " + multiplicacao);
    System.out.println("Divisao: " + divisao);
    System.out.println("Modulo: " + modulo);
    System.out.println("Concat: " + concat);

    //Operadores Unários
        int numero = +5; // O '+' é utilizado para explicitar que o valor da variável é positivo
        System.out.println("Numero: " + -numero); // O '-' foi utilizado para tornar o valor em um número negativo

        //Decrementação e Incrementação

        System.out.println(numero++); // Resultará em 5 e 6, pois a incrementação só aconteceu após receber o valor da variável
        System.out.println(numero);

        System.out.println("\n"+ ++numero); //Resultará em 7 e 7, pois a incrementação aconteceu antes de receber o valor da variável
        System.out.println(numero);

        System.out.println("\nO mesmo ocorreu para decrementação: \n");

        System.out.println(numero--); // Resultará em 7 e 6, pois a decrementação só aconteceu após receber o valor da variável
        System.out.println(numero);

        System.out.println("\n"+ --numero); //Resultará em 5 e 5, pois a decrementação aconteceu antes de receber o valor da variável
        System.out.println(numero);

        // Operador Unário de inversão (!)

        boolean exemplo = true;

        System.out.println("\nO valor " + exemplo + " pode se tornar " + !exemplo + " ao utulizar o ! no valor booleano, e vice-versa!");
        }
    }