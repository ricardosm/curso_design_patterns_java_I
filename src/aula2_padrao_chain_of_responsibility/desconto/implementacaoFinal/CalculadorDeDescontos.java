package aula2_padrao_chain_of_responsibility.desconto.implementacaoFinal;

import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

/*
 * A classe CalculadorDeDesconto tem como responsabilidade
 * calcular o desconto que dever ser aplicado ao orcamento.
 * 
 * Por meio do método calcula() ela identifica qual é o tipo
 * de desconto que dever ser aplicado e o aplica.
 * 
 * Problema 3: A chamda ao proximoDesconto de uma regra desconto
 * 			irá desencadear uma cadeia de chamadas de regras de
 * 			desconto, porém quando essa cadeia termina? Neste
 * 			cenário esta cadeia não tem fim.
 * 
 Solução 3: Para que a cadeia de chamadas de regras de desconto
 * 			(tipo de desconto) termine. Nós devemos implementar
 * 			um nova regra de desconto que não chama nem uma outra.
 * 			Esta é a ultima regra de desconto que deve ser aplicada 
 * 			e deve retornar o valor 0 de desconto. Que é o caso
 * 			onde todas as demais regras falham. A esta regra
 * 			damos o nome de SemDesconto.
 * 
 * Consideração Final: Essa idéia de termos várias regras de
 * 			desconto (tipos de desconto) e cada regra ser 
 * 			aplicada somente em um cenário específico e caso
 * 			o cenário não seja válido deve ser passado para o
 * 			próximo cenário tem um nome: Padrão de Projeto
 * 			Chain of Responsibility.
 */

public class CalculadorDeDescontos {
	
	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		
		d1.setProximoDesconto(d2);
		d2.setProximoDesconto(d3);
		d3.setProximoDesconto(d4);
		
		return d1.desconta(orcamento);
	}
}
