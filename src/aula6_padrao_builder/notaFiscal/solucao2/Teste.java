package aula6_padrao_builder.notaFiscal.solucao2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/*
 *  Solu��o: Para resolver o problema, separaremos a l�gica da cria��o desse 
 *  objeto complexo. Essa nova classe ser� respons�vel por pedir todos os
 *  par�metros necess�rios, montar o que precisa, e enfim produzir uma
 *  Nota Fiscal, de forma com que o cliente dessa classe consiga entender
 *  o que est� acontecendo.
 * 
 * Consider��es: Veja que agora a cria��o de objeto NotaFiscal, que
 * antes estava espalhada pelo c�digo (estava jogado na main()), agora
 * est� centralizado em uma classe que s� tem isso como responsabilidade.
 * 
 * Al�m do c�digo estar em um lugar s�, essa classe ainda prov� uma
 * interface bem clara e simples de ser usada, facilitando a vida
 * das classes que ir�o utiliz�-la.
 * 
 * 
 */

public class Teste {
	
	public static void main(String[] args) {
		NotaFiscal nf = new NotaFiscalBuilder().paraEmpresa("Caelum")
				.comCNPJ("123.456.789/0001-10")
				.comItem(new ItemDaNotaBuilder().comNome("Item 1").comValor(100.0).constroi())
				.comItem(new ItemDaNotaBuilder().comNome("Item 2").comValor(200.0).constroi())
				.comItem(new ItemDaNotaBuilder().comNome("Item 3").comValor(300.0).constroi())
				.comObservacoes("Entregar nf pessoalmente")
				.naData(Calendar.getInstance())
				.constroi();
		
	}
}
