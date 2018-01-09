package aula4_padrao_decorator.orcamento;

public class ImpostoMultoAlto extends Imposto {
	
	public ImpostoMultoAlto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ImpostoMultoAlto() {
		super();
	}
	
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculaOutroImposto(orcamento);
	}

}
