package collections.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	
	// Atributo
	private List<Pessoa> pessoaList;

	//Construtor
	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	public static void main (String [] args) {
		OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
		ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
		ordenacaoPessoa.adicionarPessoa("Nome 2", 1, 1.98);
		ordenacaoPessoa.adicionarPessoa("Nome 3", 35, 1.47);
		ordenacaoPessoa.adicionarPessoa("Nome 4", 29, 1.82);
		
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
	}
	
	
	
	
	
	

}
