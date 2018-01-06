package aula3_padrao_template_method.orcamento;

import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	public double usarTaxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100.0;
	}

	@Override
	public double usarTaxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {
			if(verificaDuplicidadeDe(item, orcamento)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean verificaDuplicidadeDe(Item item, Orcamento orcamento) {
		List<Item> itens = orcamento.getItens();
		int i = itens.indexOf(item);
		for(i = i + 1; i < itens.size(); i++) {
			if(item.getNome().equals(itens.get(i).getNome())) {
				return true;
			}
		}
		return false;
	}

}
