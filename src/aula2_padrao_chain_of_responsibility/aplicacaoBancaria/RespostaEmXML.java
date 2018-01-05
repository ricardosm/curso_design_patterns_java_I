package aula2_padrao_chain_of_responsibility.aplicacaoBancaria;

public class RespostaEmXML implements Resposta {

	private Resposta proxima;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.XML) {
			System.out.println("<conta>");
			System.out.println("<titular>");
			System.out.println(conta.getNomeDoTitular());
			System.out.println("</titular>");
			System.out.println("<saldo>");
			System.out.println(conta.getSaldo());
			System.out.println("</saldo>");
			System.out.println("</conta>");
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
