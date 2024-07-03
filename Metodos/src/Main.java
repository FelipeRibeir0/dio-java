/**
 * Código desenvolvido para praticar o uso de classes e criação de métodos em Java
 * @author Felipe Ribeiro
 * @version 1.5
 * @since 03/07/2024
 */

public class Main {
    public static void main(String[] args) {

   SmartTv smartTv = new SmartTv();
   smartTv.ligar();
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();

    smartTv.aumentarCanal();
    smartTv.diminuirCanal();

        smartTv.selecionarCanal(8);
    }
}