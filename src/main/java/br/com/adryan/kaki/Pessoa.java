package br.com.adryan.kaki;

import java.time.LocalDate;

public class Pessoa {
	
	private LocalDate dataNascimento;
	
	public Pessoa(LocalDate naci) {
		this.dataNascimento = naci;
	}
	
	public Integer getIdade() {
		LocalDate hj = LocalDate.now();
		LocalDate naci = this.dataNascimento;

		Integer idade = hj.getYear() - naci.getYear();

		int mesNiver = naci.getMonthValue();
		Integer diaNiver = naci.getDayOfMonth();

		int mesAtual = hj.getMonthValue();
		Integer diaAtual = hj.getDayOfMonth();

		Boolean niverOk = mesNiver < mesAtual || (mesNiver == mesAtual && diaNiver < diaAtual);
		if (!niverOk) {
			idade--;
		}
		return idade;
	}
}