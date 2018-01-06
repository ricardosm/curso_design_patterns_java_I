package aula3_padrao_template_method.orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public final double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return usarTaxacaoMaxima(orcamento);
		} else {
			return usarTaxacaoMinima(orcamento);
		}
	}

	public abstract double usarTaxacaoMinima(Orcamento orcamento);

	public abstract double usarTaxacaoMaxima(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
