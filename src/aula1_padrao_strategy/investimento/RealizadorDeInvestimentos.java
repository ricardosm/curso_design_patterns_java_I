package aula1_padrao_strategy.investimento;

public class RealizadorDeInvestimentos {
	
	public void realizaInventimento(ContaBancaria conta, Investimento estrategiaDeInvestimento) {
		double retornoInvestimento = estrategiaDeInvestimento.investir(conta);
		
		retornoInvestimento = retornoInvestimento * 0.75;
		
		conta.deposita(retornoInvestimento);
        System.out.println("Novo saldo: " + conta.getSaldo());
	}

}
