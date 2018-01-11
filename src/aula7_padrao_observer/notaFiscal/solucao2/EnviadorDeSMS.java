package aula7_padrao_observer.notaFiscal.solucao2;

public class EnviadorDeSMS implements AcaoAposGerarNota {
	
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando Nota Fiscal por SMS...");
	}
}
