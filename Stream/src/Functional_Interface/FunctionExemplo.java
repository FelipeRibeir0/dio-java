package Functional_Interface;

import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FunctionExemplo {

    public static void main(String[] args) {

        Function<Integer, Integer> quadrado = numero -> numero * numero;

        List<Integer> numeros = IntStream.range(1, 11).boxed().toList();

        List<Integer> numerosQuadrados = numeros.stream().map(quadrado).toList();

        numerosQuadrados.forEach(System.out::println);
    }
}