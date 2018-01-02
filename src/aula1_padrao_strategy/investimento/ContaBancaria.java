package aula1_padrao_strategy.investimento;

public class ContaBancaria {
	
	private double saldo;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void adicionaInvestimento(double valor) {
		this.saldo += valor;
	}
}
