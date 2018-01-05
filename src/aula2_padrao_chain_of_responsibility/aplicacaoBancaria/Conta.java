package aula2_padrao_chain_of_responsibility.aplicacaoBancaria;

public class Conta {

	private String nomeDoTitular;
	private double saldo;

	public Conta(String nomeDoTitular, double saldo) {
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public double getSaldo() {
		return saldo;
	}

}
