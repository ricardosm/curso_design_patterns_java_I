package aula4_padrao_decorator.orcamento;

public class ICMS extends Imposto {
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICMS() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50.0 + calculaOutroImposto(orcamento);
	}

}
