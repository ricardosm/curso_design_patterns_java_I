package aula1_padrao_strategy.orcamento.problema3;

import aula1_padrao_strategy.orcamento.Orcamento;

public class ISS {

	public double calculaISS(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
