package aula4_padrao_decorator.aplicacaoBancaria;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class FiltroContasAbertasNoMesCorrente extends Filtro {
	
	public FiltroContasAbertasNoMesCorrente(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroContasAbertasNoMesCorrente() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> novaListaContas = new ArrayList<>();
		for(Conta conta : contas) {
			if(conta.getDataAbertura().get(Calendar.MONTH) == GregorianCalendar.getInstance().get(Calendar.MONTH)
					&& conta.getDataAbertura().get(Calendar.YEAR) == GregorianCalendar.getInstance().get(Calendar.YEAR)) {
				novaListaContas.add(conta);
			}
		}
		novaListaContas.addAll(outroFiltro.filtra(novaListaContas));
		return novaListaContas;
	}

}
