package aula2_padrao_chain_of_responsibility.desconto.implementacaoFinal;

import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

/*
 * A classe CalculadorDeDesconto tem como responsabilidade
 * calcular o desconto que dever ser aplicado ao orcamento.
 * 
 * Por meio do m�todo calcula() ela identifica qual � o tipo
 * de desconto que dever ser aplicado e o aplica.
 * 
 * Problema 3: A chamda ao proximoDesconto de uma regra desconto
 * 			ir� desencadear uma cadeia de chamadas de regras de
 * 			desconto, por�m quando essa cadeia termina? Neste
 * 			cen�rio esta cadeia n�o tem fim.
 * 
 Solu��o 3: Para que a cadeia de chamadas de regras de desconto
 * 			(tipo de desconto) termine. N�s devemos implementar
 * 			um nova regra de desconto que n�o chama nem uma outra.
 * 			Esta � a ultima regra de desconto que deve ser aplicada 
 * 			e deve retornar o valor 0 de desconto. Que � o caso
 * 			onde todas as demais regras falham. A esta regra
 * 			damos o nome de SemDesconto.
 * 
 * Considera��o Final: Essa id�ia de termos v�rias regras de
 * 			desconto (tipos de desconto) e cada regra ser 
 * 			aplicada somente em um cen�rio espec�fico e caso
 * 			o cen�rio n�o seja v�lido deve ser passado para o
 * 			pr�ximo cen�rio tem um nome: Padr�o de Projeto
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
