package aula3_padrao_template_method.orcamento;

public class TesteCalculoDeImposto {
	
	public static void main(String[] args) {
		Imposto icpp = new ICMS();
		Imposto ikcv = new ICCC();
		
		CalculoDeImpostos calculador = new CalculoDeImpostos();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		calculador.calcula(orcamento, icpp);
		calculador.calcula(orcamento, ikcv);
	}
}
