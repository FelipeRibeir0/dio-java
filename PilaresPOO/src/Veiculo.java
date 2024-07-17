public abstract class Veiculo {
    // Classe pai que provê o chassi para a Moto e Carro (Herança)

    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    public abstract void ligar();
}
