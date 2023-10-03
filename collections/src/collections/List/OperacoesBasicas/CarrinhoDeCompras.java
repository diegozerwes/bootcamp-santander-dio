package collections.List.OperacoesBasicas;


import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> itemLista;
	
	public CarrinhoDeCompras() {
		this.itemLista = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item it = new Item(nome, preco, quantidade);
		this.itemLista.add(it);
	}
	
	
	
	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<>();
		for(Item e : itemLista) {
			if (e.getNome().equalsIgnoreCase(nome)) {
				itemParaRemover.remove(e);
			}
		}
				
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0d;
		
		for (Item it : itemLista) {
			double valorItem = it.getPreco() * it.getQuantidade();
		valorTotal = valorItem + valorTotal;
		}
		
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(this.itemLista);

		
	}
	
	public static void main (String[] args) {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Cigarro", 7, 2);
		carrinho.adicionarItem("Lápis", 2d, 3);
		carrinho.adicionarItem("Lápis", 2d, 3);
		carrinho.adicionarItem("Caderno", 35d, 1);
		carrinho.adicionarItem("Borracha", 2d, 2);
		
		
		carrinho.exibirItens();
		
		carrinho.calcularValorTotal();
		
		System.out.println(carrinho.calcularValorTotal());
		
		
		
		
		
	}
	
	

}
