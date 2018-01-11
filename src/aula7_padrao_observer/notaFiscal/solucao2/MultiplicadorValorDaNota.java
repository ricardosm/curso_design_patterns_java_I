package aula7_padrao_observer.notaFiscal.solucao2;

public class MultiplicadorValorDaNota implements AcaoAposGerarNota {
	
	private double fator;
	
	public MultiplicadorValorDaNota(double fator) {
		this.fator = fator;
	}
	
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Valor da nota multiplicado: " + notaFiscal.getValorBruto() * fator);		
	}

}
