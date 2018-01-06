package aula3_padrao_template_method.banco;

import java.util.List;

public class RelatorioSimples extends Relatorio {

	@Override
	public void cabecalho() {
		System.out.println("Banco do Brasil");
		
	}

	@Override
	public void corpo(List<Conta> contas) {
		for(Conta conta : contas) {
			System.out.println("Titular: " + conta.getNomeDoTitular() + " Saldo:" + conta.getSaldo());
		}
	}

	@Override
	public void rodape() {
		System.out.println("(32) 4000-0000");
	}

}
