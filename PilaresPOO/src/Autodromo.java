public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("59382");
        jeep.ligar();

        // Polimorfismo ao utilizar o mesmo método, ligar(), de duas formas diferentes

        Moto z400 = new Moto();
        z400.setChassi("39827");
        z400.ligar();

    }
}
