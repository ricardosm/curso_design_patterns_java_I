package aula7_padrao_observer.notaFiscal.solucao2;

/*
 * 
 * 
 */

public class Teste {
	
	public static void main(String[] args) {
		NotaFiscalBuilder criador = new NotaFiscalBuilder();
		
		criador.adicionaAcao(new EnviadorDeEmail());
		criador.adicionaAcao(new EnviadorDeSMS());
		criador.adicionaAcao(new NotaFiscalDAO());
		criador.adicionaAcao(new Impressora());
		criador.adicionaAcao(new MultiplicadorValorDaNota(5.5));
		
		criador.paraEmpresa("Caelum")
				.comCNPJ("123.456.789/0001-10")
				.comItem(new ItemDaNota("Item 1", 100.0))
				.comItem(new ItemDaNota("Item 2", 200.0))
				.comItem(new ItemDaNota("Item 3", 300.0))
				.comObservacoes("Entregar nf pessoalmente")
				.naDataAtual();
		
		NotaFiscal nf = criador.constroi();
	}
}
