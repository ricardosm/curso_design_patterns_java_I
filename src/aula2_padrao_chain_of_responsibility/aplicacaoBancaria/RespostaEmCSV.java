package aula2_padrao_chain_of_responsibility.aplicacaoBancaria;

public class RespostaEmCSV implements Resposta {

	private Resposta proxima;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.CSV) {
			System.out.println(conta.getNomeDoTitular() + "," + conta.getSaldo());
		} 
		else {
			proxima.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proxima = resposta;
	}

}
