package aula2_padrao_chain_of_responsibility.desconto.problema1;

import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

/*
 * A classe CalculadorDeDesconto tem como responsabilidade
 * calcular o desconto que dever ser aplicado ao orcamento.
 * 
 * Por meio do m�todo calcula() ela identifica qual � o tipo
 * de desconto que dever ser aplicado e o aplica.
 * 
 * Problema 1 : A cada novo tipo de desconto que surgir, deve ser
 * 			criado um novo if no m�todo calcula(). O que faz com
 * 			que a o m�todo calcula() cres�a indefinidamente, 
 * 			e consequentemente far� com que a classe tamb�m
 * 			cres�a.
 * 
 * Solu��o 1: Separar as responsabilidades da classe CalculadorDeDesconto
 * 			por meio de uma classe espec�fica para regra de desconto.
 * 
 * Problema 2: A separa��o de responsabilidades onde cada regra de 
 * 			desconto foi isolada em uma classe, melhorou o c�digo.
 * 			Por�m ainda assim, h� o problema onde o m�todo/classe
 * 			continuar� crescendo de acordo com os novas regras de 
 * 			desconto que forem inseridas no sistema. Afinal, os
 * 			if's continuam, sendo necess�rio um novo if,
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
