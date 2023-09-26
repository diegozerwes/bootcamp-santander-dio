package pooMsnMessenger.Apps;

public class ICQ extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo ICQ");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo ICQ");
	}
}
