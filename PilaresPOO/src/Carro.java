public class Carro extends Veiculo{

    public void ligar(){

        // Encapsulamento, utilizando os 2 métodos a partir do ligar()

        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }
    private void confereCambio(){
        System.out.println("CONFERINDO CAMBIO EM P");
    }
}