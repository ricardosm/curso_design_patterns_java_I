package aula7_padrao_observer.notaFiscal.solucao3;

public class NotaFiscalDAO implements AcaoAposGerarNota {
		
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvando Nota Fiscal no banco de dados...");
	}

}
