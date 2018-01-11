package aula7_padrao_observer.notaFiscal.solucao2;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviado por Nota Fiscal por e-mail...");
	}
}
