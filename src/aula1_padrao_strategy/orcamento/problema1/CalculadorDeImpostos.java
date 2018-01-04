package aula1_padrao_strategy.orcamento.problema1;

/*
 * Primeira implementa��o da classe CalculadorDeImpostos que possui
 * como responsabilidade realizar o calculo de impostos referente a
 * um or�amento.
 * 
 * Problema 1: O m�todo realizaCalculo esta calculando somente
 * 				um tipo de imposto, no caso o ICMS, como fazer para 
 * 				calcular mais de um tipo de imposto?
 * 
 * Solucao 1: A solu��o mais trivial, � passar uma string como 
 * 				par�metro para o m�todo realizaCalculo. De forma
 * 				que, por meio dele, seja poss�vel identificar qual tipo 
 * 				de imposto calcular.
 * 
 * Problema 2: O problema 2, decorre imediatamente da solucao 1,
 * 				para cada novo tipo de imposto, ser� necess�rio,
 * 				um novo if no corpo do m�todo, e assim, o tamanho 
 * 				do m�todo ir� aumentar proporcionalmente com o 
 * 				a quantidade de tipos de impostos. 
 * 
 */

import aula1_padrao_strategy.orcamento.Orcamento;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento) {
		double icms = orcamento.getValor() * 0.10;
		System.out.println("Valor do Imposto: " + icms);
	}
}
