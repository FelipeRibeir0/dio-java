import java.util.Arrays;

public class SistemaIbge {
    public static void main(String[] args) {

        Arrays.stream(EstadoBrasileiro.values()).forEach(e -> System.out.println(e.getSigla() + " - " + e.getNome()));

        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;

        System.out.println("=====================");

        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getNome());
        System.out.println(eb.getIbge());
    }
}