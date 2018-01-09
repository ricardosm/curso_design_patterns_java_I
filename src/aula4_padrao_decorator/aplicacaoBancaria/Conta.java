package aula4_padrao_decorator.aplicacaoBancaria;

import java.util.Date;
import java.util.GregorianCalendar;

public class Conta {

	private String nomeDoTitular;
	private double saldo;
	private Date dataAbertura;

	public Conta(String nomeDoTitular, double saldo) {
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
		this.dataAbertura = new GregorianCalendar().getTime();
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

}
