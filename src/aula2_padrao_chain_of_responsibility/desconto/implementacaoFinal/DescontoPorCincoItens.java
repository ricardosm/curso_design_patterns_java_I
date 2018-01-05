package aula2_padrao_chain_of_responsibility.desconto.implementacaoFinal;

import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

public class DescontoPorCincoItens implements Desconto {

	private Desconto proximoDesconto;

	public double desconta(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.10;
		} else {
			return proximoDesconto.desconta(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
		
	}
}
