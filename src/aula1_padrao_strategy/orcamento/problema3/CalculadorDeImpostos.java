package aula1_padrao_strategy.orcamento.problema3;

/*
 * Terceira implementa��o da classe CalculadorDeImpostos que possui
 * como responsabilidade realizar o calculo de impostos referente a
 * um or�amento.
 * 
 * Problema 3: Apenas dividir as responsabilidades, da classe CalculadorDeImpostos
 * 				n�o resolve o problema de termos v�rios if's no m�todo realizaCalculo.
 * 				Criar uma nova classe para cada tipo de imposto nos fornece um c�digo
 * 				um pouco mais coeso. Por�m, por si s�, n�o resolve o problema dos if's. 
 * 
 * Solucao 3: Neste cen�rio, a solu��o mais trivial para resolver o problema de ainda
 * 				termos v�rios if's no m�todo realizaCalculo() � quebrar este m�todo
 * 				em v�rios m�todos, sendo necess�rio um novo m�todo para cada tipo 
 * 				de imposto. 
 * 
 * Problema 4: Criar um novo m�todo para cada tipo de imposto resolve o problema de
 * 				termos um unico m�todo com v�rios if's, por�m n�o resolve o problema 
 * 				geral. Neste cen�rio, apenas mudamos o problema inicial de lugar, 
 * 				pois, para  cada novo tipo de imposto ainda continua sendo necess�rio 
 * 				criar um novo m�todo na classe CalculadorDeImpostos, e ela continuar�
 * 				crescendo indefinidamente, conforme a quantidade de tipos de impostos.
 * 
 */

import aula1_padrao_strategy.orcamento.Orcamento;

public class CalculadorDeImpostos {
	
	public void realizaCalculoICMS(Orcamento orcamento) {
		double icms = new ICMS().calculaICMS(orcamento);
		System.out.println("Valor do ICMS: " + icms);
	}
	
	public void realizaCalculoISS(Orcamento orcamento) {
		double iss = new ISS().calculaISS(orcamento);
		System.out.println("Valor do iss: " + iss);
	}
}
