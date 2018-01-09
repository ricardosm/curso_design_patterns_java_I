package aula5_padrao_state.orcamento;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento est� em estado de reprova��o, n�o pode aprovar agora!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� reprovado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
