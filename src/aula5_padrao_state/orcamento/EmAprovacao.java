package aula5_padrao_state.orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {
	
	private boolean descontoAplicado;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado) {
			orcamento.valor = orcamento.valor - orcamento.valor * 0.05;
			this.descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto j� aplicado.");
		}		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or�amento em aprova��o n�o pode ir para finalizado diretamente.");
	}

}
