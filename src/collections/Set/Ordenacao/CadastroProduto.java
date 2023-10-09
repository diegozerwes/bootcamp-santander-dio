package collections.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
	
	// atributos
	
	 private Set<Produto> produtoSet;
	 
	 public CadastroProduto() {
		 this.produtoSet = new HashSet<>();
	 }
	 
	 public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		 produtoSet.add(new Produto(cod, nome, preco, quantidade));
	 }
	 
	 public Set<Produto> exibirProdutosPorNome(){
		 Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		 return produtosPorNome;
	 }
	 
	 public Set<Produto> exibirProdutosPorPreco(){
		 Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		 produtosPorPreco.addAll(produtoSet);
		 return produtosPorPreco;
	 }
	 
	 
	 
	 public static void main (String[] args) {
		 CadastroProduto cadastroProdutos = new CadastroProduto();
		 
		 cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
		 cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
		 cadastroProdutos.adicionarProduto(3L, "Produto 3", 10d, 2);
		 cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);
		 
		 System.out.println(cadastroProdutos.produtoSet);
		 
		 System.out.println(cadastroProdutos.exibirProdutosPorNome());
		 
		 System.out.println(cadastroProdutos.exibirProdutosPorPreco());
		 
		 
		 
		 
	 }
}

