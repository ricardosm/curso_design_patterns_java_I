package aula1_padrao_strategy.orcamento.problema4;

import aula1_padrao_strategy.orcamento.Orcamento;

public class ImpostoICMS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

}
