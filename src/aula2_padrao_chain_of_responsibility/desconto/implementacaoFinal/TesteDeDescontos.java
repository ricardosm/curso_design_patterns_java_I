package aula2_padrao_chain_of_responsibility.desconto.implementacaoFinal;

import aula2_padrao_chain_of_responsibility.desconto.Item;
import aula2_padrao_chain_of_responsibility.desconto.Orcamento;

public class TesteDeDescontos {
	
	public static void main(String[] args) {
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d3 = new DescontoPorVendaCasada();
        Desconto d4 = new SemDesconto();

        d1.setProximoDesconto(d2);
        d2.setProximoDesconto(d3);
        d3.setProximoDesconto(d4);

        Item lapis = new Item("LAPIS", 15.00);
        Item caneta = new Item("CANETA", 15.00);
        Item borracha = new Item("borracha", 15.00);

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionaItem(caneta);
        orcamento.adicionaItem(borracha);
        orcamento.adicionaItem(lapis);       
		
		double valorDesconto = calculador.calcula(orcamento);
		
		System.out.println("Valor do Desconto: " + valorDesconto);
	}

}
