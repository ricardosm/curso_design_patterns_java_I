package aula2_padrao_chain_of_responsibility.desconto;

public class Item {

	private String nome;
	private double valor;

	public Item(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;

	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

}
