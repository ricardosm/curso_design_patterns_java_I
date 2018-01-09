package aula4_padrao_decorator.orcamento;

public class ICPP extends TemplateDeImpostoCondicional {
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICPP() {
		super();
	}

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
