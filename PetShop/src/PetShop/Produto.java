package PetShop;

public class Produto {
	private String nome, categoria;
	private int preco, qtdEstoque;
	
	public Produto(String nome, String categoria, int preco, int qtdEstoque) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	public void vender(int qtd) {
		if(qtdEstoque < qtd) {
			System.out.println("produto sem estoque");
			
		}else {
			qtdEstoque -= qtd;
			
		}
	}
	
public void reporEstoque(int qtd) {
		
		qtdEstoque = qtdEstoque + qtd;
		
	}
}
