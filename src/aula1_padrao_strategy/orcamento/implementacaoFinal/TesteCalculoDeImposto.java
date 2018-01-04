package aula1_padrao_strategy.orcamento.implementacaoFinal;

public class TesteCalculoDeImposto {
	
	public static void main(String[] args) {
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		Imposto iss = new ISS();
		
		CalculoDeImpostos calculador = new CalculoDeImpostos();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		calculador.calcula(orcamento, icms);
		calculador.calcula(orcamento, iss);
		calculador.calcula(orcamento, iccc);
	}
}
