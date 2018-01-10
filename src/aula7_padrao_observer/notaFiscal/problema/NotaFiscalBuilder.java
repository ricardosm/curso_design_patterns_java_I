package aula7_padrao_observer.notaFiscal.problema;

import java.util.Calendar;
import java.util.List;

/*
 * Para classes cuja responsabilidade é a de criar outros objetos, 
 * geralmente complexos, damos o nome de Builder. 
 * Ela esconde toda a lógica da criação de objetos complexos.
 * 
 */

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private Calendar data;
	private String observacoes;
	
	private List<ItemDaNota> itens;
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemDaNota item) {
		itens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder naDataAtual() {
		this.data = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, itens, observacoes);
	}
		
}
