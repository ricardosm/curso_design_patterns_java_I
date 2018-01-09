package aula5_padrao_state.aplicacaoBancaria;

public class EstadoSaldoNegativo implements EstadoDeUmaConta {

	@Override
	public void saque(Conta conta, double valor) {
		throw new RuntimeException("Conta com saldo negativo não permite saques.");
		
	}

	@Override
	public void deposito(Conta conta, double valor) {
		conta.saldo = conta.saldo + valor * 0.95;
		
		if(conta.saldo >= 0) {
			conta.estado = new EstadoSaldoPositivo();
		}
	}

}
