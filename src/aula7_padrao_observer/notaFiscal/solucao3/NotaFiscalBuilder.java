package aula7_padrao_observer.notaFiscal.solucao3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.sun.corba.se.impl.oa.poa.AOMEntry;

/*  
 *  Solução 2: A grande questão é como diminuir o acoplamento entre o 
 *  método constroi(), que precisa invocar essa lista de ações, e as 
 *  classes que realizam essas ações?
 *  Para começar, vamos encontrar algo em comum entre todas as ações que 
 *  acontecem após a nota ser gerada: todas elas fazem algo com a Nota Fiscal 
 *  logo após ela ser gerada. Podemos então criar uma interface para 
 *  representar esse comportamento em comum.
 */

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private Calendar data;
	private String observacoes;
	
	private List<ItemDaNota> itens;
	private List<AcaoAposGerarNota> acoes;
	
	public NotaFiscalBuilder() {
		this.itens = new ArrayList<>();
		this.acoes = new ArrayList<>();
	}
	
	public NotaFiscalBuilder(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
		this.itens = new ArrayList<>();
	}
	
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
	
	public void adicionaAcao(AcaoAposGerarNota acao) {
		acoes.add(acao);
	}
	
	public NotaFiscal constroi() {
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, itens, observacoes);
		
		for(AcaoAposGerarNota acao : acoes) {
			acao.executa(notaFiscal);
		}
		
		return notaFiscal;
	}
	
}
