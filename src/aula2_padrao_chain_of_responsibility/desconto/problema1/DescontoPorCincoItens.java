package aula2_padrao_chain_of_responsibility.desconto.problema1;

import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

public class DescontoPorCincoItens {

	public double desconta(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.10;
		} else {
			return 0;
		}
	}
}
