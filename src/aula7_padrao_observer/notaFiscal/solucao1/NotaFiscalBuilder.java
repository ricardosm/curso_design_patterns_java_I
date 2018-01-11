package aula7_padrao_observer.notaFiscal.solucao1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/*
 
 *  Solu��o 1: Uma primeira melhoria nele seria extrair as responsabilidades 
 *  para diferentes classes. Ou seja, uma classe respons�vel somente por 
 *  persistir no banco de dados, uma somente respons�vel por enviar e-mails
 *  e assim por diante. E, por fim, o NotaFiscalBuilder, ao inv�s de conter 
 *  todo o c�digo, reutilizar o c�digo escrito nessas classes especialistas.
 *  
 *  Considera��es: Melhoramos o c�digo. As classes EnviadorDeEmail, 
 *  NotaFiscalDao, EnviadorDeSms, e Impressora agora tem somente uma 
 *  �nica responsabilidade.
 *  
 *  Problema 2: O m�todo constroi() utiliza muitas outras classes para 
 *  realizar sua tarefa. Ele � altamente acoplado a essas classes!
 *  
 *  Solu��o 2: A grande quest�o � como diminuir o acoplamento entre o 
 *  m�todo constroi(), que precisa invocar essa lista de a��es, e as 
 *  classes que realizam essas a��es?
 *  Para come�ar, vamos encontrar algo em comum entre todas as a��es que 
 *  acontecem ap�s a nota ser gerada: todas elas fazem algo com a Nota Fiscal 
 *  logo ap�s ela ser gerada. Podemos ent�o criar uma interface para 
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
	
	public NotaFiscalBuilder() {
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
	
	public NotaFiscal constroi() {
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, itens, observacoes);
		
		new EnviadorDeEmail().enviaPorEmail(notaFiscal);
		new NotaFiscalDAO().salvaNoBanco(notaFiscal);
		new EnviadorDeSMS().enviaPorSMS(notaFiscal);
		new Impressora().imprime(notaFiscal);
		
		return notaFiscal;
	}
	
}
