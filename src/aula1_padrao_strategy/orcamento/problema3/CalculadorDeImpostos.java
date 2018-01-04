package aula1_padrao_strategy.orcamento.problema3;

/*
 * Terceira implementação da classe CalculadorDeImpostos que possui
 * como responsabilidade realizar o calculo de impostos referente a
 * um orçamento.
 * 
 * Problema 3: Apenas dividir as responsabilidades, da classe CalculadorDeImpostos
 * 				não resolve o problema de termos vários if's no método realizaCalculo.
 * 				Criar uma nova classe para cada tipo de imposto nos fornece um código
 * 				um pouco mais coeso. Porém, por si só, náo resolve o problema dos if's. 
 * 
 * Solucao 3: Neste cenário, a solução mais trivial para resolver o problema de ainda
 * 				termos vários if's no método realizaCalculo() é quebrar este método
 * 				em vários métodos, sendo necessário um novo método para cada tipo 
 * 				de imposto. 
 * 
 * Problema 4: Criar um novo método para cada tipo de imposto resolve o problema de
 * 				termos um unico método com vários if's, porém não resolve o problema 
 * 				geral. Neste cenário, apenas mudamos o problema inicial de lugar, 
 * 				pois, para  cada novo tipo de imposto ainda continua sendo necessário 
 * 				criar um novo método na classe CalculadorDeImpostos, e ela continuará
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
