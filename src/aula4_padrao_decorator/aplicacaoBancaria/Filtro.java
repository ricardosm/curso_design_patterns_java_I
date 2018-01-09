package aula4_padrao_decorator.aplicacaoBancaria;

import java.util.List;

public abstract class Filtro {
	
	public abstract List<Conta> filtra(List<Conta> contas);
}
