package collections.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	
	private Set<Aluno> alunosSet;
	
	public GerenciadorAlunos() {
		this.alunosSet = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, Long matricula, double media) {
		alunosSet.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAlunoPorMatricula(long matricula) {
		Aluno alunoParaRemover = null;
		for(Aluno a : alunosSet) {
			if(a.getMatricula() == matricula) {
				alunoParaRemover = a;
				break;
			}
		}
		alunosSet.remove(alunoParaRemover);
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
		return alunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
		alunosPorNota.addAll(alunosSet);
		return alunosPorNota;
	}

	
	public static void main (String[] args) {
		GerenciadorAlunos geral = new GerenciadorAlunos();
		
		geral.adicionarAluno("Pilar", 1L, 9d);
		geral.adicionarAluno("Ana", 2L, 8d);
		geral.adicionarAluno("Diego", 3L, 7d);
		geral.adicionarAluno("Chipa", 456L, 3d);
		geral.adicionarAluno("Cáli", 5L, 9d);
		
		System.out.println(geral.alunosSet);
		
		geral.removerAlunoPorMatricula(456L);
		System.out.println(geral.alunosSet);
		
		
		
		System.out.println(geral.exibirAlunosPorNome());
		System.out.println(geral.exibirAlunosPorNota());
		
	}
				
				
}
