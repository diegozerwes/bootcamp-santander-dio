package pooLanchonete;

import pooLanchonete.area.cliente.Cliente;
import pooLanchonete.atendimento.Atendente;
import pooLanchonete.atendimento.cozinha.Almoxarife;
import pooLanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estarem disponíveis para toda a aplicação
		
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
		
		
		//esta ação é muito sigilosa, qua tal ser privada ?
		
		
		//já pensou os clientes ouvindo que o gás acabou ?
		
		
		
	}
}