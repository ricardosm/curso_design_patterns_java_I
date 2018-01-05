package aula2_padrao_chain_of_responsibility.aplicacaoBancaria;

public interface Resposta {
	public void responde(Requisicao req, Conta conta);
	public void setProxima(Resposta resposta);
}
