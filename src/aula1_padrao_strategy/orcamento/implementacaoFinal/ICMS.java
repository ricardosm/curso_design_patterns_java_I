package aula1_padrao_strategy.orcamento.implementacaoFinal;

public class ICMS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50.0;
	}

}
