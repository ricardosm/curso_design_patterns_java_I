package aula2_padrao_chain_of_responsibility.desconto.problema3;

import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		// N�o faz nada! Fim da cadeia de regras de desconto.
		
	}
	
	
}
