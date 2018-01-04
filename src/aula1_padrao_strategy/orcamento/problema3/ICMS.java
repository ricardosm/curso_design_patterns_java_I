package aula1_padrao_strategy.orcamento.problema3;

import aula1_padrao_strategy.orcamento.Orcamento;

public class ICMS {
	
	public double calculaICMS(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}
}
