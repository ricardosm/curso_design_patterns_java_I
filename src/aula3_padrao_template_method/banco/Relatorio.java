package aula3_padrao_template_method.banco;

import java.util.List;

public abstract class Relatorio {
	public abstract void cabecalho();
	public abstract void corpo(List<Conta> contas);
	public abstract void rodape();
	
	public final void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}
}
