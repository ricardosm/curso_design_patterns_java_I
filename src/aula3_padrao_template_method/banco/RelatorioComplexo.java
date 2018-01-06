package aula3_padrao_template_method.banco;

import java.util.Calendar;
import java.util.List;

public class RelatorioComplexo extends Relatorio {

	@Override
	public void cabecalho() {
		System.out.println("Banco do Brasil");
		System.out.println("(32) 4000-2000");
		System.out.println("Avenida Trancredo Neves - 985");
	}

	@Override
	public void corpo(List<Conta> contas) {
		for(Conta conta : contas) {
			System.out.println("Titular: " + conta.getNomeDoTitular());
			System.out.println("Saldo: " + conta.getSaldo());
			System.out.println("Número da Conta: 9925-2");
			System.out.println("Agência: 0165-2");
		}
		
	}

	@Override
	public void rodape() {
		System.out.println("bancodobrasil@bancodobrasil.com");
		System.out.println(Calendar.getInstance().toString());
	}

}
