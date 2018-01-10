package aula7_padrao_observer.notaFiscal.problema;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/*
 *  Solução: Para resolver o problema, separaremos a lógica da criação desse 
 *  objeto complexo. Essa nova classe será responsável por pedir todos os
 *  parâmetros necessários, montar o que precisa, e enfim produzir uma
 *  Nota Fiscal, de forma com que o cliente dessa classe consiga entender
 *  o que está acontecendo.
 * 
 * Considerções: Veja que agora a criação de objeto NotaFiscal, que
 * antes estava espalhada pelo código (estava jogado na main()), agora
 * está centralizado em uma classe que só tem isso como responsabilidade.
 * 
 * Além do código estar em um lugar só, essa classe ainda provê uma
 * interface bem clara e simples de ser usada, facilitando a vida
 * das classes que irão utilizá-la.
 * 
 * 
 */

public class Teste {
	
	public static void main(String[] args) {
		NotaFiscalBuilder criador = new NotaFiscalBuilder().paraEmpresa("Caelum")
				.comCNPJ("123.456.789/0001-10")
				.comItem(new ItemDaNota("Item 1", 100.0))
				.comItem(new ItemDaNota("Item 2", 200.0))
				.comItem(new ItemDaNota("Item 3", 300.0))
				.comObservacoes("Entregar nf pessoalmente")
				.naDataAtual();
		
		NotaFiscal nf = criador.constroi();
	}
}
