package aula4_padrao_decorator.aplicacaoBancaria;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Conta {

	private String nomeDoTitular;
	private double saldo;
	private Calendar dataAbertura;

	public Conta(String nomeDoTitular, double saldo) {
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
		this.dataAbertura = GregorianCalendar.getInstance();
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

}
