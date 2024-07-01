import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("\n===================== OPERADORES ARITMÉTICOS =====================\n");

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


        System.out.println("\n===================== OPERADORES UNÁRIOS =====================\n");

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


        System.out.println("\n===================== OPERADORES TERNÁRIOS =====================\n");

        /*
        Operadores Ternários
        <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>


        Estrutura condicional sem o uso dos operadores ternários */

        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);

        if(num1 >= num2){
        System.out.println(num1 + " é maior ou igual a " + num2);
        }
        else {
            System.out.println(num2 + " é maior que " + num1);
        }

        // O mesmo exemplo, só que agora utilizando Operadores Ternários

        String mensagem = num1 >= num2 ? num1 + " é maior ou igual a " + num2 : num2 + " é maior que " + num1;
        System.out.println(mensagem);

        // Operadores relacionais

        System.out.println("\n===================== OPERADORES RELACIONAIS =====================\n");

        System.out.println(num1 + " é igual a "+ num2+ " = " + (num1 == num2)); // Verifica a IGUALDADE entre ambos valores
        System.out.println(num1 + " é diferente de "+ num2+ " = " + (num1 != num2)); // Verifica a DIFERENÇA entre ambos valores

        System.out.println(num1 + " é menor que "+ num2+ " = " + (num1<num2)); // Verifica se o primeiro elemento é MENOR do que o segundo
        System.out.println(num1 + " é menor ou igual que "+ num2+ " = " + (num1<=num2)); // Verifica se o primeiro elemento é MENOR OU IGUAL do que o segundo

        System.out.println(num1 + " é maior a "+ num2+ " = " + (num1>num2)); // Verifica se o primeiro elemento é MAIOR do que o segundo
        System.out.println(num1 + " é maior ou igual a "+ num2+ " = " + (num1>=num2)); // Verifica se o primeiro elemento é maior ou igual do que o segundo

        // Operadores lógicos

        System.out.println("\n===================== OPERADORES LÓGICOS =====================\n");

        System.out.println((num1 > 0 && num2 > 0) ? "Ambos são positivos" : "Nem ambos são positivos"); // E, verifica se todas condições são verdadeiras
        System.out.println((num1 > 0 || num2 > 0) ? "Pelo menos um é positivo" : "Nenhum é positivo"); // OU, verifica se pelo menos 1 condição é verdadeira
        System.out.println((!(num1 > 0)) ? "Não é positivo" : "É positivo"); // NÃO, verifica se a condição NÃO é true
    }
    }