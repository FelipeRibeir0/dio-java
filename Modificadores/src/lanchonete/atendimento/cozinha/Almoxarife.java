package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("CONTROLANDO A ENTRADA");
    }
    private void controlarSaida(){
        System.out.println("CONTROLANDO A SAIDA");
    }
    void entregarIngredientes(){
        System.out.println("ENTREGAR INGREDIENTES");
        controlarSaida();
    }
    void trocarGas(){
        System.out.println("ALMOXARIFE TROCANDO O GAS");
    }
}