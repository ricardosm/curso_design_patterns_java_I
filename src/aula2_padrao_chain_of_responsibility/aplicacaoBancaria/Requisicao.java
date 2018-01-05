package aula2_padrao_chain_of_responsibility.aplicacaoBancaria;

public class Requisicao {

	private Formato formato;

	public Requisicao(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}

}
