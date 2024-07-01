public class SmartTv {
    private boolean ligada = false;
    private int canal = 572;
    private int volume = 10;

    public boolean ligar() {
        return this.ligada = true;
    }

    public boolean desligar() {
        return this.ligada = false;
    }

    private boolean estaLigada() {
        if (!this.ligada) {
            System.out.println("A TV está desligada. Não é possível realizar esta ação.");
            return false;
        }
        return true;
    }

    public void aumentarVolume() {
        if (estaLigada()) {
            if (this.volume < 100) {
                System.out.println("Aumentando o volume para: " + ++this.volume);
            } else {
                System.out.println("Volume máximo, não há como aumentar");
            }
        }
    }

    public void diminuirVolume() {
        if (estaLigada()) {
            if (this.volume > 0) {
                System.out.println("Diminuindo o volume para: " + --this.volume);
            } else {
                System.out.println("Volume mínimo, não há como diminuir");
            }
        }
    }

    public void aumentarCanal() {
        if (estaLigada() && this.canal > 0) {
            System.out.println("Aumentando o canal para: " + ++this.canal);
        }
    }

    public void diminuirCanal() {
        if (estaLigada() && this.canal > 1) {
            System.out.println("Diminuindo o canal para: " + --this.canal);
        } else if (estaLigada()) {
            System.out.println("Canal indisponível");
        }
    }

    public void selecionarCanal(int canalSelecionado) {
        if (estaLigada() && canalSelecionado >= 1) {
            this.canal = canalSelecionado;
            System.out.println("Novo canal: " + this.canal);
        }
    }
}