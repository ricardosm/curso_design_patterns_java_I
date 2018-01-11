package aula7_padrao_observer.notaFiscal.solucao3;

import java.util.ArrayList;
import java.util.List;

/*
 * Recebendo a lista pelo construtor garantimos que, no momento da 
 * constru��o do builder, j� teremos todas as a��es que devem ser 
 * executadas ap�s a gera��o da nota, e n�o haveria possibilidade 
 * dos clientes dessa classe a instanciarem sem definir essa lista 
 * primeiro.
 * 
 * 
 * Al�m do mais, caso voc� esteja usando algum framework de inje��o 
 * de depend�ncia, como Spring ou Guice, eles conseguir�o injetar 
 * essa lista pelo construtor facilmente.
 */

public class Teste {
	
	public static void main(String[] args) {
		
		List<AcaoAposGerarNota> acoes = new ArrayList<>();
		
		acoes.add(new EnviadorDeEmail());
		acoes.add(new EnviadorDeSMS());
		acoes.add(new NotaFiscalDAO());
		acoes.add(new Impressora());
		acoes.add(new MultiplicadorValorDaNota(5.5));
		
		
		new NotaFiscalBuilder(acoes).paraEmpresa("Caelum")
				.comCNPJ("123.456.789/0001-10")
				.comItem(new ItemDaNota("Item 1", 100.0))
				.comItem(new ItemDaNota("Item 2", 200.0))
				.comItem(new ItemDaNota("Item 3", 300.0))
				.comObservacoes("Entregar nf pessoalmente")
				.naDataAtual()
				.constroi();
		
		//NotaFiscal nf = criador.
	}
}
