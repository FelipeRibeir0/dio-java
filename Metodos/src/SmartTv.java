/**
 * Classe para objetos do tipo SmartTv, onde serão contidos valores e métodos para o controle da TV.
 * @author Felipe Ribeiro
 * @version 1.5
 * @since 03/07/2024
 */
public class SmartTv {
    private boolean ligada = false;
    private int canal = 572;
    private int volume = 10;

    /**
     * Método para definir a televisão como ligada.
     * @return boolean - true se a TV foi ligada com sucesso, false se já estava ligada.
     */
    public boolean ligar() {
        if (!this.ligada) {
            this.ligada = true;
            return true;
        } else {
            System.out.println("A TV já está ligada.");
            return false;
        }
    }

    /**
     * Método para definir a televisão como desligada.
     * @return boolean - true se a TV foi desligada com sucesso, false se já estava desligada.
     */
    public boolean desligar() {
        if (this.ligada) {
            this.ligada = false;
            return true;
        } else {
            System.out.println("A TV já está desligada.");
            return false;
        }
    }

    /**
     * Método para verificar se a televisão está ligada ou desligada.
     * @return boolean - true se a TV está ligada, false se está desligada.
     */
    private boolean estaLigada() {
        if (!this.ligada) {
            System.out.println("A TV está desligada. Não é possível realizar esta ação.");
        }
        return this.ligada;
    }

    /**
     * Método para aumentar o volume da televisão.
     * Aumenta e informa o volume da televisão através de uma mensagem de texto.
     */
    public void aumentarVolume() {
        if (estaLigada()) {
            if (this.volume < 100) {
                System.out.println("Aumentando o volume para: " + ++this.volume);
            } else {
                System.out.println("Volume máximo, não há como aumentar");
            }
        }
    }

    /**
     * Método para diminuir o volume da televisão.
     * Diminui e informa o volume da televisão através de uma mensagem de texto.
     */
    public void diminuirVolume() {
        if (estaLigada()) {
            if (this.volume > 0) {
                System.out.println("Diminuindo o volume para: " + --this.volume);
            } else {
                System.out.println("Volume mínimo, não há como diminuir");
            }
        }
    }

    /**
     * Método para aumentar o canal da televisão.
     * Aumenta e informa o canal da televisão através de uma mensagem de texto.
     */
    public void aumentarCanal() {
        if (estaLigada() && this.canal > 0) {
            System.out.println("Aumentando o canal para: " + ++this.canal);
        }
    }

    /**
     * Método para diminuir o canal da televisão.
     * Diminui e informa o canal da televisão através de uma mensagem de texto.
     */
    public void diminuirCanal() {
        if (estaLigada() && this.canal > 1) {
            System.out.println("Diminuindo o canal para: " + --this.canal);
        } else if (estaLigada()) {
            System.out.println("Canal indisponível");
        }
    }

    /**
     * Método para mudar o canal da televisão para um canal específico.
     * @param canalSelecionado int - Canal que será selecionado na televisão.
     * Muda o canal da televisão para o canal selecionado.
     */
    public void selecionarCanal(int canalSelecionado) {
        if (estaLigada() && canalSelecionado >= 1) {
            this.canal = canalSelecionado;
            System.out.println("Novo canal: " + this.canal);
        }
    }
}