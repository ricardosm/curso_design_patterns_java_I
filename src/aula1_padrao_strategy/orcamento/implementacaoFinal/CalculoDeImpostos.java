package aula1_padrao_strategy.orcamento.implementacaoFinal;

public class CalculoDeImpostos {
	
	public void calcula(Orcamento orcamento, Imposto imposto) {
		double valorImposto = imposto.calcula(orcamento);
		System.out.println("Valor do imposto: " + valorImposto);
	}

}
