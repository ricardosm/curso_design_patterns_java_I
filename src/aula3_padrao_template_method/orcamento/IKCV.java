package aula3_padrao_template_method.orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {
			if(item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double usarTaxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double usarTaxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		if(orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento)) {
			return true;
		}
		return false;
	}

}
