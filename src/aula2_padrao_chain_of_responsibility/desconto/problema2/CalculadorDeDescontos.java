package aula2_padrao_chain_of_responsibility.desconto.problema2;

import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

/*
 * A classe CalculadorDeDesconto tem como responsabilidade
 * calcular o desconto que dever ser aplicado ao orcamento.
 * 
 * Por meio do método calcula() ela identifica qual é o tipo
 * de desconto que dever ser aplicado e o aplica.
 * 
 * Problema 2: A separação de responsabilidades onde cada regra de 
 * 			desconto foi isolada em uma classe, melhorou o código.
 * 			Porém ainda assim, há o problema onde o método/classe
 * 			continuará crescendo de acordo com os novas regras de 
 * 			desconto que forem inseridas no sistema. Afinal, os
 * 			if's continuam, sendo necessário um novo if,
 * 			para cada regra de desconto.
 * 
 * Solução 2: O ideal seria que, um regra de desconto, saiba
 * 			chamar uma outra regra de desconto caso a sua 
 * 			regra não seja válida. E este tipo de desconto
 * 			a ser chamado deve ser genérico (válido para
 * 			qualquer tipo de desconto que viesse a ser
 * 			implementado no sistema). Vamos então criar um
 * 			tipo comum para os descontos, uma interface.
 * 			Além disso, todo tipo de desconto deve ter uma
 * 			referencia para o proximo desconto a ser chamado,
 * 			diante disso além do método desconta() essa interface,
 * 			deve ter um método setProximoDesconto().
 * 
 * Problema 3: A chamda ao proximoDesconto de uma regra desconto
 * 			irá desencadear uma cadeia de chamadas de regras de
 * 			desconto, porém quando essa cadeia termina? Neste
 * 			cenário esta cadeia não tem fim.
 */

public class CalculadorDeDescontos {
	
	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		
		d1.setProximoDesconto(d2);
		
		return d1.desconta(orcamento); // A cadeia não acaba
	}
}
