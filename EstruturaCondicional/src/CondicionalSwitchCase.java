/*
Switch case: seleciona e executa blocos de código com base no valor de uma variável, útil para múltiplas condições.
*/
public class CondicionalSwitchCase {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano){
            case "T":
                System.out.println("5GB de Youtube");
            case "M":
                System.out.println("WhatsApp e Instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação");
        }
    }
}