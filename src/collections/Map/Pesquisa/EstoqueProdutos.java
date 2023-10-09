package collections.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {	
	
	// atributo
	 
	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}

	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0;
		if(!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
						
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		for(Produto p: estoqueProdutosMap.values()) {
			if (p.getPreco() > maiorPreco) {
				produtoMaisCaro = p;
			}
			
		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		for(Produto p: estoqueProdutosMap.values()) {
			if (p.getPreco() < menorPreco) {
				produtoMaisBarato = p;
				menorPreco = p.getPreco();
			}
			
		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorQuantidadeValorNoEstoque = null;
		double maiorValorTotalProdutoEstoque = 0d;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
				double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
				if(valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
					maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
					produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
				}
			}
		}
		return produtoMaiorQuantidadeValorNoEstoque;
	}
	
	
	public static void main (String[] args) {
		
		EstoqueProdutos esPro = new EstoqueProdutos();
		
		esPro.exibirProdutos();
		
		esPro.adicionarProduto(1L, "Produto 1", 10, 5.0);
		esPro.adicionarProduto(2L, "Produto 2", 5, 100.0);
		esPro.adicionarProduto(3L, "Produto 3", 2, 15.0);
		esPro.adicionarProduto(4L, "Produto 4", 2, 55.0);
		
		
		
		esPro.exibirProdutos();
		
		System.out.println("Valor Total do Estoque: " + esPro.calcularValorTotalEstoque());
		
		System.out.println(esPro.obterProdutoMaisCaro());
		System.out.println(esPro.obterProdutoMaisBarato());
		
		System.out.println("Maior valor no Estoque Total" + esPro.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
		
	}
}
