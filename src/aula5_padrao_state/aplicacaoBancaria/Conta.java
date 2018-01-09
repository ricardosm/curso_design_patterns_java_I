package aula5_padrao_state.aplicacaoBancaria;

public class Conta {

	private String nomeDoTitular;
	protected double saldo;
	protected EstadoDeUmaConta estado;
	
	public Conta(String nomeDoTitular, double saldo) {
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
		estado = new EstadoSaldoPositivo();
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		estado.deposito(this, valor);
	}
	
	public void saca(double valor) {
		estado.saque(this, valor);
	}
}
