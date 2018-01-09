package aula4_padrao_decorator.orcamento;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public Imposto() {
		this.outroImposto = null;
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	protected double calculaOutroImposto(Orcamento orcamento) {
		if(outroImposto != null) {
			return outroImposto.calcula(orcamento);
		} else {
			return 0;
		}
	}
}
