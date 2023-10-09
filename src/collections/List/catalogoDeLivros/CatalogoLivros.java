package collections.List.catalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	// Atributos
	
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}	
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l :livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
			
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main (String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.adicionarLivro( "O Processo", "Kafka", 1987);
		catalogoLivros.adicionarLivro( "Notas do Subsolo", "Dostoiévski", 1934);
		catalogoLivros.adicionarLivro("Quincas Borba", "Machado de Assis", 1913);
		catalogoLivros.adicionarLivro("1933 foi um ano ruim", "Fante", 1933);
		catalogoLivros.adicionarLivro("I'm Your Man", "Simons", 2017);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Fante"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1933, 1934));
		System.out.println(catalogoLivros.pesquisarPorTitulo("O processo"));
		
	}
	
	

}
