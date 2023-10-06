package collections.Set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	// Atributos
	
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado (String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
		
	}
	
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	

	public static void main (String [] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		
		
		conjuntoConvidados.adicionarConvidado("Convidado 1", 5478);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 5479);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 5481);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 5480);
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(5481);
		conjuntoConvidados.removerConvidadoPorCodigoConvite(5480);
		
		conjuntoConvidados.exibirConvidados();
		
		System.out.println("Existem "  + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
	}
	
	
}
