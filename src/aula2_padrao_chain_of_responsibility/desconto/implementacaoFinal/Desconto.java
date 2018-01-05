package aula2_padrao_chain_of_responsibility.desconto.implementacaoFinal;

import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

public interface Desconto {
	
	public double desconta(Orcamento orcamento);
	public void setProximoDesconto(Desconto desconto);
}
