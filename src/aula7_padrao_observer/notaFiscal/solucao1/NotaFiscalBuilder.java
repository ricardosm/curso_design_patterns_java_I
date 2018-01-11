package aula7_padrao_observer.notaFiscal.solucao1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/*
 
 *  Solução 1: Uma primeira melhoria nele seria extrair as responsabilidades 
 *  para diferentes classes. Ou seja, uma classe responsável somente por 
 *  persistir no banco de dados, uma somente responsável por enviar e-mails
 *  e assim por diante. E, por fim, o NotaFiscalBuilder, ao invés de conter 
 *  todo o código, reutilizar o código escrito nessas classes especialistas.
 *  
 *  Considerações: Melhoramos o código. As classes EnviadorDeEmail, 
 *  NotaFiscalDao, EnviadorDeSms, e Impressora agora tem somente uma 
 *  única responsabilidade.
 *  
 *  Problema 2: O método constroi() utiliza muitas outras classes para 
 *  realizar sua tarefa. Ele é altamente acoplado a essas classes!
 *  
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
