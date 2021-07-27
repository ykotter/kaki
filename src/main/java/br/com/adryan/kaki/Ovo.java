package br.com.adryan.kaki;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ovo {
	
	private Integer tamanho;
	private Integer fritada;
	private Boolean quebrado;
	
	
	
	public Ovo(Integer tamanho) {
		this.quebrado = false;
		this.fritada = 0;
		this.tamanho = tamanho;
	}
	
	public void quebrar() {
		this.quebrado = true;
	}
	
	public void fritar() {
		if (!this.quebrado) {
			throw new RuntimeException("Ovo nao esta quebrado");
		}
		this.fritada++;
	}

	public Integer pegarTamanho() {
		return tamanho;
	}

	public EnumStatusOvo pegarStatus() {
		
		
		if (fritada > 0 && tamanho > 0) {
			BigDecimal f = BigDecimal.valueOf(fritada);
			BigDecimal t = BigDecimal.valueOf(tamanho);
			BigDecimal ponto = f.divide(t, 2, RoundingMode.FLOOR);
			
			if (ponto.compareTo(BigDecimal.valueOf(2)) < 0) {
				return EnumStatusOvo.CRU;
			}
			if (ponto.compareTo(BigDecimal.valueOf(3)) < 0) {
				return EnumStatusOvo.MEIO_FRITO;
			}
			if (ponto.compareTo(BigDecimal.valueOf(5)) < 0) {
				return EnumStatusOvo.DELICIA;
			}
			if (ponto.compareTo(BigDecimal.valueOf(7)) < 0) {
				return EnumStatusOvo.MEIO_QUEIMADO;
			}
			return EnumStatusOvo.QUEIMADO;
		}
		return EnumStatusOvo.CRU;
	}
	
	public Boolean estaQuebrado() {
		return quebrado;
	}
}
