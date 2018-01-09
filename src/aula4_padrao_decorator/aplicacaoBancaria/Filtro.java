package aula4_padrao_decorator.aplicacaoBancaria;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	protected Filtro outroFiltro;
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public Filtro() {
		this.outroFiltro = null;
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	protected List<Conta> aplicarOutroFiltro(List<Conta> contas) {
		if(outroFiltro != null) {
			return outroFiltro.filtra(contas);
		} else {
			return new ArrayList<Conta>();
		}
		
	}
}
