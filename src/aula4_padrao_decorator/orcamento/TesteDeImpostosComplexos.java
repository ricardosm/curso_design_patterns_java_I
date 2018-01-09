package aula4_padrao_decorator.orcamento;

public class TesteDeImpostosComplexos {
	
	public static void main(String[] args) {
		Imposto icmsComISS = new ICMS(new ISS());
		Imposto issComICMS = new ISS(new ICMS());
		Imposto issComICCC = new ISS(new ICCC());
		Imposto impostoMuitoAltoComISS = new ImpostoMultoAlto(new ISS());
		
		//CalculoDeImpostos calculador = new CalculoDeImpostos();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		//calculador.calcula(orcamento, icpp);
		//calculador.calcula(orcamento, ikcv);
		
		double valorImpostoicmsComISS = icmsComISS.calcula(orcamento);
		double valorImpostoissComICMS = issComICMS.calcula(orcamento);
		double valorImpostoissComICCC= issComICCC.calcula(orcamento);
		double valorImpostoMuitoAltoComISS = impostoMuitoAltoComISS.calcula(orcamento);
		
		System.out.println("Valor do ImpostoicmsComISS: " + valorImpostoicmsComISS);
		System.out.println("Valor do ImpostoissComICMS: " + valorImpostoissComICMS);
		System.out.println("Valor do ImpostoissComICCC: " + valorImpostoissComICCC);
		System.out.println("Valor do ImpostoMuitoAltoComISS : " + valorImpostoMuitoAltoComISS);
	}
}
