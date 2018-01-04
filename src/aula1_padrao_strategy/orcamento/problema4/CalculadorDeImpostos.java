package aula1_padrao_strategy.orcamento.problema4;

/*
 * Terceira implementa��o da classe CalculadorDeImpostos que possui
 * como responsabilidade realizar o calculo de impostos referente a
 * um or�amento.
 * 
 * Problema 4: Criar um novo m�todo para cada tipo de imposto resolve o problema de
 * 				termos um unico m�todo com v�rios if's, por�m n�o resolve o problema 
 * 				geral. Neste cen�rio, apenas mudamos o problema inicial de lugar. 
 * 				Para  cada novo tipo de imposto ainda continua sendo necess�rio 
 * 				criar um novo m�todo na classe CalculadorDeImpostos, e ela continuar�
 * 				crescendo indefinidamente, conforme a quantidade de tipos de impostos.
 * 
 * Solu��o 4: Precisamos criar um m�todo realizaCalculo() que seja gen�rico, ou seja,
 * 				que funcione para cada novo tipo de imposto. O m�todo deve receber
 * 				um tipo de imposto qualquer, e deve realizar o c�lculo de imposto
 * 				como base na regra de neg�cio que o pr�prio imposto j� possui.
 * 				Todo imposto possui um m�todo em comum, todos eles possuem o m�todo
 * 				calculaImposto(), que recebe um orcamento e retorna um double que
 * 				representa o valor do imposto calculado. Quando v�rias classes, possuem
 * 				um comportamento em comum, podemos definir um contrato entre elas, a 
 * 				este contrato damos o nome de interface. Vamos criar uma interface
 * 				Imposto e definir um m�todo que se chamada calcula() que recebe um
 * 				Orcamento e retorna um double. E cada classe de tipo imposto, deve
 * 				obrigatoriamente implementar esta interface. Devemos tamb�m, fazer
 * 				com que o m�todo realizaCalculo() da classe CalculadorDeImpostos,
 * 				receba um Imposto (gen�rico).
 * 
 * Considera��o Final: O cliente que utilizar a classe CalculadorDeImpostos, ir�
 * 						passar uma estrat�gia de c�lculo de impostos para o calculador.
 * 						O calculador recebe esta estrat�gia por meio do m�todo
 * 						realizaCalculo() e a utiliza para calcular o imposto.
 * 						Este padr�o de projeto recebe o nome de Strategy.
 * 						Agora a classe CalculadorDeImpostos n�o possui um m�todo
 * 						com v�rios if's (um para cada tipo de imposto) e nem mesmo
 * 						v�rios m�todos para cada tipo de imposto. E melhor, agora
 * 						� poss�vel criar um novo tipo de imposto (classe que
 * 						implementa a interface Imposto) e o c�digo da classe
 * 						CalculadorDeImpostos n�o precisar� ser alterado. Ela
 * 						funcionar� para qualquer novo tipo de imposto criado.
 */	

import aula1_padrao_strategy.orcamento.Orcamento;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valorImposto = imposto.calcula(orcamento);
		System.out.println("Valor do Imposto: " + valorImposto);
	}

}
