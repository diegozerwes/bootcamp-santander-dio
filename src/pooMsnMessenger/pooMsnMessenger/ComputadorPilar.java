package pooMsnMessenger.pooMsnMessenger;

import pooMsnMessenger.Apps.ICQ;
import pooMsnMessenger.Apps.MSNMessenger;
import pooMsnMessenger.Apps.ServicoMensagemInstantanea;
import pooMsnMessenger.Apps.Telegram;

public class ComputadorPilar {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "icq";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("icq"))
			smi = new ICQ();
		else if (appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
		
	}

}
