package aula1_padrao_strategy.orcamento.problema2;

/*
 * Segunda implementa��o da classe CalculadorDeImpostos que possui
 * como responsabilidade realizar o calculo de impostos referente a
 * um or�amento.
 * 
 * Problema 2: O problema 2, decorre imediatamente da solucao 1,
 * 				para cada novo tipo de imposto, ser� necess�rio,
 * 				um novo if no corpo do m�todo, e assim, o tamanho 
 * 				do m�todo ir� aumentar proporcionalmente com o 
 * 				a quantidade de tipos de impostos. 
 * 
 * Solucao 2: Dividir a responsabilidade da classe CalculadorDeImpostos
 * 				em diversas classes espec�ficas. Criando assim, uma nova 
 * 				classe para cada tipo de imposto.
 * 
 * Problema 3: Apenas dividir as responsabilidades, da classe CalculadorDeImpostos
 * 				n�o resolve o problema de termos v�rios if's no m�todo realizaCalculo().
 * 				Criar uma nova classe para cada tipo de imposto nos fornece um c�digo
 * 				um pouco mais coeso. Por�m, por si s�, n�o resolve o problema dos if's.
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
