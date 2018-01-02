package aula1_padrao_strategy.investimento;

public class InvestimentoArrojado implements Investimento {
	
	@Override
	public double investir(ContaBancaria conta) {
		double escolhido = new java.util.Random().nextDouble();
		
		if(escolhido <= 0.20) {
			return conta.getSaldo() * 0.5;
		} else if (escolhido <= 0.50) {
			return conta.getSaldo() * 0.3;
		} else {
			return conta.getSaldo() * 0.06;
		}
	}
}
