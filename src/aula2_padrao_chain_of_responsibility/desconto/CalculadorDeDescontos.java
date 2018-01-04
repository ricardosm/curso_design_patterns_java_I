package aula2_padrao_chain_of_responsibility.desconto;

/*
 * A classe CalculadorDeDesconto tem como responsabilidade
 * calcular o desconto que dever ser aplicado ao orcamento.
 * 
 * Por meio do m�todo calcula() ela identifica qual � o tipo
 * de desconto que dever ser aplicado e o aplica.
 * 
 * Problema1 : A cada novo tipo de desconto que surgir, deve ser
 * 			criado um novo if no m�todo calcula(). O que faz com
 * 			que a o m�todo calcula() cres�a indefinidamente, 
 * 			e consequentemente far� com que a classe tamb�m
 * 			cres�a.
 * 
 * Solu��o 1: Separar as responsabilidades da classe CalculadorDeDesconto
 * 			por meio de uma classe espec�fica para cada tipo de desconto.
 * 
 */

public class CalculadorDeDescontos {
	
	public double calcula(Orcamento orcamento) {
		// mais de 5 itens
		if(orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.10;
		}
		// valor maior que 500
		if(orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		// caso contr�rio (sem desconto)
		return 0;
	}
}
