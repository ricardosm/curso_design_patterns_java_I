package aula5_padrao_state.orcamento;

public class Aprovado implements EstadoDeUmOrcamento {

	private boolean descontoAplicado;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado) {
			orcamento.valor = orcamento.valor - orcamento.valor * 0.02;
			this.descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto j� aplicado.");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� em estado de aprova��o.");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento est� em estado de aprova��o e n�o pode ser reprovado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();		
	}
	
}
