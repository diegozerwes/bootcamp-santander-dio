package collections.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
	
	private Set<Tarefa> tarefasSet;

	public ListaTarefa() {
		this.tarefasSet = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefasSet.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		if(!tarefasSet.isEmpty()) {
			for(Tarefa taf : tarefasSet) {
				if(taf.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover = taf;
					break;
				}
			}
			tarefasSet.remove(tarefaParaRemover);
		}
		else {
			System.out.println("A lista de tarefas está vazia");
		}
	}
	
	public void exibirTarefas() {
		if(!tarefasSet.isEmpty()) {
			System.out.println(tarefasSet);
		} else {
		System.out.println("A lista de tarefas está vazia");
		}
	}
	
	public int contarTarefas() {
		return tarefasSet.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for(Tarefa taf : tarefasSet) {
			if(taf.isConcluida()) {
				tarefasConcluidas.add(taf);
			}
		}
		return tarefasConcluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
		for(Tarefa taf : tarefasSet) {
			if(!taf.isConcluida()) {
				tarefasNaoConcluidas.add(taf);
			}
		}
		return tarefasNaoConcluidas;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa taf : tarefasSet) {
			if(taf.getDescricao().equalsIgnoreCase(descricao)) {
				taf.setConcluida(true);
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		Tarefa tarefaParaMarcarComoPendente = null;
		for(Tarefa taf : tarefasSet) {
			if(taf.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaMarcarComoPendente = taf;
				break;
			}
			
		}
		
		if (tarefaParaMarcarComoPendente != null) {
			if(tarefaParaMarcarComoPendente.isConcluida()) {
				tarefaParaMarcarComoPendente.setConcluida(false);
			}
		} else {
			System.out.println("Tarefa não encontrada na lista");
		}
	}
	
	public void limparListaTarefas() {
		if(tarefasSet.isEmpty()) {
			System.out.println("A lista já está vazia");
		} else {
			tarefasSet.clear();
		}
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefas = new ListaTarefa();
		
		// Adicionando tarefas à lista
	    listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
	    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");

	    // Exibindo as tarefas na lista
	    listaTarefas.exibirTarefas();
	    
	 // Removendo uma tarefa
	    listaTarefas.removerTarefa("Fazer exercícios físicos");
	    listaTarefas.exibirTarefas();
	
	
	 // Contando o número de tarefas na lista
    	System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
    	  // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
	
	
	}

}
