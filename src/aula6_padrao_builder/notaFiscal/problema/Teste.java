package aula6_padrao_builder.notaFiscal.problema;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/*
 *	Problema: O construtor � extenso e dif�cil de entender. Al�m do mais, 
 *	a regra de cria��o do objeto acabou ficando espalhada pelo c�digo do m�todo main();
 *  Pior, as vezes ainda temos o problema de par�metros opcionais. Nesse caso, o
 *  programador come�a a criar diferentes construtores, cada um com uma poss�vel 
 *  combina��o de par�metros de entrada, tornando a sua classe mais dif�cil 
 *  ainda de ser lida.
 *  
 *  Solu��o: Para resolver o problema, separaremos a l�gica da cria��o desse 
 *  objeto complexo. Essa nova classe ser� respons�vel por pedir todos os
 *  par�metros necess�rios, montar o que precisa, e enfim produzir uma
 *  Nota Fiscal, de forma com que o cliente dessa classe consiga entender
 *  o que est� acontecendo.
 * 
 * 
 * 
 */

public class Teste {
	
	public static void main(String[] args) {
		List<ItemDaNota> itens = new ArrayList<>();
		itens.add(new ItemDaNota("Caneta", 2.5));
		itens.add(new ItemDaNota("Lapis", 0.9));
		double valorTotal = 0;
		for(ItemDaNota item : itens) {
			valorTotal += item.getValor();
		}
		double impostos = valorTotal * 0.05;
		NotaFiscal nf = new NotaFiscal("Raz�o Social qualquer", "Um CNPJ", Calendar.getInstance(), valorTotal, impostos, itens, "observa��es quaiquer");
	}
}
