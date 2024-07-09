/*
Esse aqui é um extra. Eu vi o For, eu tinha que ver o forEach kkkk

ForEach: O forEach em Java é um método de iteração introduzido em coleções como Listas.
Ele permite executar uma ação para cada elemento da coleção de forma concisa.
É uma alternativa moderna ao uso de loops tradicionais, melhorando a legibilidade do código.
*/

import java.util.stream.IntStream;

public class forEach {
    public static void main(String[] args) {
        IntStream numeros = IntStream.rangeClosed(1, 10);
        numeros.forEach(forEach::Tabuada);
    }

    public static void Tabuada (int multiplicando){
            IntStream.rangeClosed(1, 20).forEach(multiplicador ->
                    System.out.println(multiplicando + " x " + multiplicador + " = " + multiplicando * multiplicador));
        System.out.println("=================");
    }
}


/*
Ao invés disso:
Ambos fazem a mesma coisa, mas de formas diferentes

    public static void main(String[] args) {
        for (int numero = 1; numero <= 10; numero++)
            Tabuada(numero);
    }

    public static void Tabuada(int multiplicando) {

        for (int i = 1; i <= 10; i++)
            System.out.println(multiplicando + " x " + i + " = " + multiplicando * i);
        System.out.println("=================");
    }
}
*/