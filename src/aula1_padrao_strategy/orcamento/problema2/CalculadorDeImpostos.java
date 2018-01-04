package aula1_padrao_strategy.orcamento.problema2;

/*
 * Segunda implementação da classe CalculadorDeImpostos que possui
 * como responsabilidade realizar o calculo de impostos referente a
 * um orçamento.
 * 
 * Problema 2: O problema 2, decorre imediatamente da solucao 1,
 * 				para cada novo tipo de imposto, será necessário,
 * 				um novo if no corpo do método, e assim, o tamanho 
 * 				do método irá aumentar proporcionalmente com o 
 * 				a quantidade de tipos de impostos. 
 * 
 * Solucao 2: Dividir a responsabilidade da classe CalculadorDeImpostos
 * 				em diversas classes específicas. Criando assim, uma nova 
 * 				classe para cada tipo de imposto.
 * 
 * Problema 3: Apenas dividir as responsabilidades, da classe CalculadorDeImpostos
 * 				não resolve o problema de termos vários if's no método realizaCalculo().
 * 				Criar uma nova classe para cada tipo de imposto nos fornece um código
 * 				um pouco mais coeso. Porém, por si só, náo resolve o problema dos if's.
 */

import aula1_padrao_strategy.orcamento.Orcamento;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento, String tipoImposto) {
		if(tipoImposto.equals("ICMS")) {
			double icms = orcamento.getValor() * 0.10;
			System.out.println("Valor do ICMS: " + icms);
		} else if(tipoImposto.equals("ISS")) {
			double iss = orcamento.getValor() * 0.06;
			System.out.println("Valor do iss: " + iss);
		}
	}
}
