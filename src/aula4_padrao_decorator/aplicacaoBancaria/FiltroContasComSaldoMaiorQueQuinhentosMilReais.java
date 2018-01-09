package aula4_padrao_decorator.aplicacaoBancaria;

import java.util.ArrayList;
import java.util.List;

public class FiltroContasComSaldoMaiorQueQuinhentosMilReais extends Filtro {
	
	public FiltroContasComSaldoMaiorQueQuinhentosMilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroContasComSaldoMaiorQueQuinhentosMilReais() {
		super();
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> novaListaContas = new ArrayList<>();
		for(Conta conta : contas) {
			if(conta.getSaldo() > 500000.0) {
				novaListaContas.add(conta);
			}
		}
		novaListaContas.addAll(outroFiltro.filtra(novaListaContas));
		return novaListaContas;
	}

}
