package aula7_padrao_observer.notaFiscal.solucao2;

public class Impressora implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Imprimindo Nota Fiscal...");
	}
}
