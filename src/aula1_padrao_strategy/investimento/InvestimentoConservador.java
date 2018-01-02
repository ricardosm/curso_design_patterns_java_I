package aula1_padrao_strategy.investimento;

public class InvestimentoConservador implements Investimento {
	
	@Override
	public double investir(ContaBancaria conta) {
		return conta.getSaldo() * 0.8;
	}
}
