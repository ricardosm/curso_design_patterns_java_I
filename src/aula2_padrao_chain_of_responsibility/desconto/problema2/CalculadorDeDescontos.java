package aula2_padrao_chain_of_responsibility.desconto.problema2;

import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

/*
 * A classe CalculadorDeDesconto tem como responsabilidade
 * calcular o desconto que dever ser aplicado ao orcamento.
 * 
 * Por meio do m�todo calcula() ela identifica qual � o tipo
 * de desconto que dever ser aplicado e o aplica.
 * 
 * Problema 2: A separa��o de responsabilidades onde cada regra de 
 * 			desconto foi isolada em uma classe, melhorou o c�digo.
 * 			Por�m ainda assim, h� o problema onde o m�todo/classe
 * 			continuar� crescendo de acordo com os novas regras de 
 * 			desconto que forem inseridas no sistema. Afinal, os
 * 			if's continuam, sendo necess�rio um novo if,
 * 			para cada regra de desconto.
 * 
 * Solu��o 2: O ideal seria que, um regra de desconto, saiba
 * 			chamar uma outra regra de desconto caso a sua 
 * 			regra n�o seja v�lida. E este tipo de desconto
 * 			a ser chamado deve ser gen�rico (v�lido para
 * 			qualquer tipo de desconto que viesse a ser
 * 			implementado no sistema). Vamos ent�o criar um
 * 			tipo comum para os descontos, uma interface.
 * 			Al�m disso, todo tipo de desconto deve ter uma
 * 			referencia para o proximo desconto a ser chamado,
 * 			diante disso al�m do m�todo desconta() essa interface,
 * 			deve ter um m�todo setProximoDesconto().
 * 
 * Problema 3: A chamda ao proximoDesconto de uma regra desconto
 * 			ir� desencadear uma cadeia de chamadas de regras de
 * 			desconto, por�m quando essa cadeia termina? Neste
 * 			cen�rio esta cadeia n�o tem fim.
 */

public class CalculadorDeDescontos {
	
	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		
		d1.setProximoDesconto(d2);
		
		return d1.desconta(orcamento); // A cadeia n�o acaba
	}
}
