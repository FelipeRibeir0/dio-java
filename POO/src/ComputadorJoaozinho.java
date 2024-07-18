public class ComputadorJoaozinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "tele";

        smi = switch (appEscolhido) {
            case "msn" -> new MSNMessenger();
            case "face" -> new FacebookMessenger();
            case "tele" -> new Telegram();
            default -> smi;
        };

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
