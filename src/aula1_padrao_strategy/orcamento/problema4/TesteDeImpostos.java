package aula1_padrao_strategy.orcamento.problema4;

import aula1_padrao_strategy.orcamento.Orcamento;
import aula1_padrao_strategy.orcamento.problema3.ICMS;
import aula1_padrao_strategy.orcamento.problema3.ISS;

public class TesteDeImpostos {
	
	public static void main(String[] args) {
		Imposto iss = new ImpostoISS();
		Imposto icms = new ImpostoICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
	}
}
