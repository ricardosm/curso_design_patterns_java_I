package aula3_padrao_template_method.orcamento;

public class CalculoDeImpostos {
	
	public void calcula(Orcamento orcamento, Imposto imposto) {
		double valorImposto = imposto.calcula(orcamento);
		System.out.println("Valor do imposto: " + valorImposto);
	}

}
