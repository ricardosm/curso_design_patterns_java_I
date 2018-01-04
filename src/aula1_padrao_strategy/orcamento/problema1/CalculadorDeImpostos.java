package aula1_padrao_strategy.orcamento.problema1;

/*
 * Primeira implementação da classe CalculadorDeImpostos que possui
 * como responsabilidade realizar o calculo de impostos referente a
 * um orçamento.
 * 
 * Problema 1: O método realizaCalculo esta calculando somente
 * 				um tipo de imposto, no caso o ICMS, como fazer para 
 * 				calcular mais de um tipo de imposto?
 * 
 * Solucao 1: A solução mais trivial, é passar uma string como 
 * 				parâmetro para o método realizaCalculo. De forma
 * 				que, por meio dele, seja possível identificar qual tipo 
 * 				de imposto calcular.
 * 
 * Problema 2: O problema 2, decorre imediatamente da solucao 1,
 * 				para cada novo tipo de imposto, será necessário,
 * 				um novo if no corpo do método, e assim, o tamanho 
 * 				do método irá aumentar proporcionalmente com o 
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
