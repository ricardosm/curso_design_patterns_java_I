package aula7_padrao_observer.notaFiscal.solucao3;

public class EnviadorDeSMS implements AcaoAposGerarNota {
	
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando Nota Fiscal por SMS...");
	}
}
