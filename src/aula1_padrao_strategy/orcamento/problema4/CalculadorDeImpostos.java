package aula1_padrao_strategy.orcamento.problema4;

/*
 * Terceira implementação da classe CalculadorDeImpostos que possui
 * como responsabilidade realizar o calculo de impostos referente a
 * um orçamento.
 * 
 * Problema 4: Criar um novo método para cada tipo de imposto resolve o problema de
 * 				termos um unico método com vários if's, porém não resolve o problema 
 * 				geral. Neste cenário, apenas mudamos o problema inicial de lugar. 
 * 				Para  cada novo tipo de imposto ainda continua sendo necessário 
 * 				criar um novo método na classe CalculadorDeImpostos, e ela continuará
 * 				crescendo indefinidamente, conforme a quantidade de tipos de impostos.
 * 
 * Solução 4: Precisamos criar um método realizaCalculo() que seja genérico, ou seja,
 * 				que funcione para cada novo tipo de imposto. O método deve receber
 * 				um tipo de imposto qualquer, e deve realizar o cálculo de imposto
 * 				como base na regra de negócio que o próprio imposto já possui.
 * 				Todo imposto possui um método em comum, todos eles possuem o método
 * 				calculaImposto(), que recebe um orcamento e retorna um double que
 * 				representa o valor do imposto calculado. Quando várias classes, possuem
 * 				um comportamento em comum, podemos definir um contrato entre elas, a 
 * 				este contrato damos o nome de interface. Vamos criar uma interface
 * 				Imposto e definir um método que se chamada calcula() que recebe um
 * 				Orcamento e retorna um double. E cada classe de tipo imposto, deve
 * 				obrigatoriamente implementar esta interface. Devemos também, fazer
 * 				com que o método realizaCalculo() da classe CalculadorDeImpostos,
 * 				receba um Imposto (genérico).
 * 
 * Consideração Final: O cliente que utilizar a classe CalculadorDeImpostos, irá
 * 						passar uma estratégia de cálculo de impostos para o calculador.
 * 						O calculador recebe esta estratégia por meio do método
 * 						realizaCalculo() e a utiliza para calcular o imposto.
 * 						Este padrão de projeto recebe o nome de Strategy.
 * 						Agora a classe CalculadorDeImpostos não possui um método
 * 						com vários if's (um para cada tipo de imposto) e nem mesmo
 * 						vários métodos para cada tipo de imposto. E melhor, agora
 * 						é possível criar um novo tipo de imposto (classe que
 * 						implementa a interface Imposto) e o código da classe
 * 						CalculadorDeImpostos não precisará ser alterado. Ela
 * 						funcionará para qualquer novo tipo de imposto criado.
 */	

import aula1_padrao_strategy.orcamento.Orcamento;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valorImposto = imposto.calcula(orcamento);
		System.out.println("Valor do Imposto: " + valorImposto);
	}

}
