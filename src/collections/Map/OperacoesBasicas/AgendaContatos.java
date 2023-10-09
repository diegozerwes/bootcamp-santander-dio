package collections.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos(){
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.get(nome);
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	
	public static void main (String[] args) {
		AgendaContatos agCon = new AgendaContatos();
		
		agCon.adicionarContato("Pilar", 123456);
		agCon.adicionarContato("Pilar", 123);
		agCon.adicionarContato("Pilar Carreiro", 165412);
		agCon.adicionarContato("Pilar Ferreira", 987456);
		agCon.adicionarContato("Ana Paula", 165412);
		agCon.adicionarContato("Pilar", 44444);
		
		agCon.exibirContatos();
		
		agCon.removerContato("Ana Paula");
		
		agCon.exibirContatos();
		
		System.out.println("O número de Pilar Ferreira é: " + agCon.pesquisarPorNome("Pilar Ferreira"));
	}
	

}
