package collections.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	//atributos
	
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato (String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContato() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato c: contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	
	
	public static void main (String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		
		
		
		agenda.adicionarContato("Pilar", 98765432);
		agenda.adicionarContato("Pilar", 0);
		agenda.adicionarContato("Pilar Ferreira", 11111111);
		agenda.adicionarContato("Pilar Carreiro", 22222222);
		agenda.adicionarContato("Ana Málaga", 11111111);
		
		agenda.exibirContato();
		
		System.out.println(agenda.pesquisarPorNome("Pilar"));
		
		System.out.println("Contato atualizado" + agenda.atualizarNumeroContato("Ana Málaga", 5521452));
		
		agenda.exibirContato();
		
	}
	

}
