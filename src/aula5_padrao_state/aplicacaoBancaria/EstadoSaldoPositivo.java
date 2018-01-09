package aula5_padrao_state.aplicacaoBancaria;

public class EstadoSaldoPositivo implements EstadoDeUmaConta {

	@Override
	public void saque(Conta conta, double valor) {
		conta.saldo = conta.saldo - valor;
		
		if(conta.saldo < 0) {
			conta.estado = new EstadoSaldoNegativo();
		}
	}

	@Override
	public void deposito(Conta conta, double valor) {
		conta.saldo = conta.saldo + valor * 0.98;
	}
	
}
