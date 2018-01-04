package aula1_padrao_strategy.investimento;

public class InvestimentoModerado implements Investimento {
	
	@Override
	public double investir(ContaBancaria conta) {
		boolean escolhido = new java.util.Random().nextDouble() < 0.50;
		
		if(escolhido) {
			return conta.getSaldo() * 0.025;
		} else {
			return conta.getSaldo() * 0.007;
		}
	}
}
