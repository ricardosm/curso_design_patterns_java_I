package aula2_padrao_chain_of_responsibility.desconto.problema3;

import aula2_padrao_chain_of_responsibility.desconto.Item;
import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

public class TesteDeDescontos {
	
	public static void main(String[] args) {
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(600.0);
		
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		
		double valorDesconto = calculador.calcula(orcamento);
		
		System.out.println("Valor do Desconto: " + valorDesconto);
	}

}
