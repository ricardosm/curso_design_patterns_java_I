package aula2_padrao_chain_of_responsibility.desconto.problema1;

import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

/*
 * A classe CalculadorDeDesconto tem como responsabilidade
 * calcular o desconto que dever ser aplicado ao orcamento.
 * 
 * Por meio do método calcula() ela identifica qual é o tipo
 * de desconto que dever ser aplicado e o aplica.
 * 
 * Problema 1 : A cada novo tipo de desconto que surgir, deve ser
 * 			criado um novo if no método calcula(). O que faz com
 * 			que a o método calcula() cresça indefinidamente, 
 * 			e consequentemente fará com que a classe também
 * 			cresça.
 * 
 * Solução 1: Separar as responsabilidades da classe CalculadorDeDesconto
 * 			por meio de uma classe específica para regra de desconto.
 * 
 * Problema 2: A separação de responsabilidades onde cada regra de 
 * 			desconto foi isolada em uma classe, melhorou o código.
 * 			Porém ainda assim, há o problema onde o método/classe
 * 			continuará crescendo de acordo com os novas regras de 
 * 			desconto que forem inseridas no sistema. Afinal, os
 * 			if's continuam, sendo necessário um novo if,
 * 			para cada regra de desconto.
 */

public class CalculadorDeDescontos {
	
	public double calcula(Orcamento orcamento) {
		double valorDesconto = new DescontoPorCincoItens().desconta(orcamento);
		if(valorDesconto == 0) {
			valorDesconto = new DescontoPorMaisDeQuinhentosReais().desconta(orcamento); 
		}
		//
		// ...
		// 
		return 0;
	}
}
