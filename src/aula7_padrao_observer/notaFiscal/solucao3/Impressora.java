package aula7_padrao_observer.notaFiscal.solucao3;

public class Impressora implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Imprimindo Nota Fiscal...");
	}
}
