package aula5_padrao_state.aplicacaoBancaria;

public interface EstadoDeUmaConta {
	
	public void saque(Conta conta, double valor);
	
	public void deposito(Conta conta, double valor);
	
}
