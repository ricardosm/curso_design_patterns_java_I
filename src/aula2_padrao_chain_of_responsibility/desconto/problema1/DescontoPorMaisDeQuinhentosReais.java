package aula2_padrao_chain_of_responsibility.desconto.problema1;

import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

public class DescontoPorMaisDeQuinhentosReais {

	public double desconta(Orcamento orcamento) {
		if(orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		} else {
			return 0;
		}
	}
}
