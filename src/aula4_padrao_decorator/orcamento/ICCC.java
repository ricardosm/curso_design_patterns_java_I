package aula4_padrao_decorator.orcamento;

public class ICCC extends Imposto {
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICCC() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		if(orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05 + calculaOutroImposto(orcamento);
		}
		else if(orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.07 + calculaOutroImposto(orcamento);
		} else {
			return orcamento.getValor() + 30.0 + calculaOutroImposto(orcamento);
		}
	}

}
