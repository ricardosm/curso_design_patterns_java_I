package aula6_padrao_builder.notaFiscal.problema;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/*
 *	Problema: O construtor é extenso e difícil de entender. Além do mais, 
 *	a regra de criação do objeto acabou ficando espalhada pelo código do método main();
 *  Pior, as vezes ainda temos o problema de parâmetros opcionais. Nesse caso, o
 *  programador começa a criar diferentes construtores, cada um com uma possível 
 *  combinação de parâmetros de entrada, tornando a sua classe mais difícil 
 *  ainda de ser lida.
 *  
 *  Solução: Para resolver o problema, separaremos a lógica da criação desse 
 *  objeto complexo. Essa nova classe será responsável por pedir todos os
 *  parâmetros necessários, montar o que precisa, e enfim produzir uma
 *  Nota Fiscal, de forma com que o cliente dessa classe consiga entender
 *  o que está acontecendo.
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
		NotaFiscal nf = new NotaFiscal("Razão Social qualquer", "Um CNPJ", Calendar.getInstance(), valorTotal, impostos, itens, "observações quaiquer");
	}
}
