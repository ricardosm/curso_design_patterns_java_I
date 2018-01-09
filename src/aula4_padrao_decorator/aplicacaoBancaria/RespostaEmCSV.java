package aula4_padrao_decorator.aplicacaoBancaria;

public class RespostaEmCSV implements Resposta {

	private Resposta proxima;
	
	public RespostaEmCSV(Resposta proxima) {
		this.proxima = proxima;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.CSV) {
			System.out.println(conta.getNomeDoTitular() + "," + conta.getSaldo());
		} 
		else {
			proxima.responde(req, conta);
		}
	}

}
