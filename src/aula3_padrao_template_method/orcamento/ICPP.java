package aula3_padrao_template_method.orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

	@Override
	public double usarTaxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double usarTaxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		if(orcamento.getValor() > 500) {
			return true;
		}
		return false;
	}

}
