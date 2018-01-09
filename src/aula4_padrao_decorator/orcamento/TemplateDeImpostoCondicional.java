package aula4_padrao_decorator.orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {
	
	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateDeImpostoCondicional() {
		super();
	}
	
	@Override
	public final double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return usarTaxacaoMaxima(orcamento) + calculaOutroImposto(orcamento);
		} else {
			return usarTaxacaoMinima(orcamento) + calculaOutroImposto(orcamento);
		}
	}

	public abstract double usarTaxacaoMinima(Orcamento orcamento);

	public abstract double usarTaxacaoMaxima(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
