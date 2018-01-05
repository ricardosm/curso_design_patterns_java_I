package aula2_padrao_chain_of_responsibility.desconto.implementacaoFinal;

import aula2_padrao_chain_of_responsibility.desconto.Item;
import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double desconta(Orcamento orcamento) {
		if(existeItem("LAPIS", orcamento) && existeItem("CANETA", orcamento)) {
			return orcamento.getValor() * 0.05;
		} else {
			return proximoDesconto.desconta(orcamento);
		}		
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
		
	}
	
	private boolean existeItem(String nomeDoItem, Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {
			if(item.getNome().equals(nomeDoItem)) {
				return true;
			}
		}
		return false;
	}
}
