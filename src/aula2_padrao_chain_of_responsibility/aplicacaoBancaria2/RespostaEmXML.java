package aula2_padrao_chain_of_responsibility.aplicacaoBancaria2;

public class RespostaEmXML implements Resposta {

	private Resposta proxima;
	
	public RespostaEmXML(Resposta proxima) {
		this.proxima = proxima;
	}
	
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

}
