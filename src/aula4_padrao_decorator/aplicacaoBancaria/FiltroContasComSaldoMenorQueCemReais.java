package aula4_padrao_decorator.aplicacaoBancaria;

import java.util.ArrayList;
import java.util.List;

public class FiltroContasComSaldoMenorQueCemReais extends Filtro {
	
	public FiltroContasComSaldoMenorQueCemReais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroContasComSaldoMenorQueCemReais() {
		super();
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> novaListaContas = new ArrayList<>();
		for(Conta conta : contas) {
			if(conta.getSaldo() < 100.0) {
				novaListaContas.add(conta);
			}
		}
		
		
		return novaListaContas;
	}

}
