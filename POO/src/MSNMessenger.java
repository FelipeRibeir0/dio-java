public class MSNMessenger extends ServicoMensagemInstantanea {
public void enviarMensagem(){
    validarConectadoInternet();
System.out.println("Enviando mensagem pelo MSN Messeger");
}
public void receberMensagem(){
System.out.println("Recebendo mensagem pelo MSN Messeger");
}
}