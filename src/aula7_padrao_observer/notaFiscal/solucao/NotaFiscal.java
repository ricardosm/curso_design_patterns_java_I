package aula7_padrao_observer.notaFiscal.solucao;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSical;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> itens;
	private String observacoes;

	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataDeEmissao, double valorBruto, double impostos,
			List<ItemDaNota> itens, String observacoes) {
		this.razaoSical = razaoSocial;
		this.cnpj = cnpj;
		this.dataDeEmissao = dataDeEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	public Object getRazaoSical() {
		return razaoSical;
	}

	public Object getCnpj() {
		return cnpj;
	}

	public Object getDataDeEmissao() {
		return dataDeEmissao;
	}

	public Object getValorBruto() {
		return valorBruto;
	}

	public Object getImpostos() {
		return impostos;
	}

	public Object getItens() {
		return itens;
	}

	public Object getObservacoes() {
		return observacoes;
	}

}
