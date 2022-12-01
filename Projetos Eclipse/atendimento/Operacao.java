package com.curvello.atendimento;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Operacao {
	
	private Date inicio;
	private Date fim;
	
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFim() {
		return fim;
	}
	public void setFim(Date fim) {
		this.fim = fim;
	}
	
	public Date tempoTotal() {
		
		LocalDate data1= LocalDate.of(this.inicio);
		LocalDate data2= LocalDate.of(this.fim);

		var dias= ChronoUnit.DAYS.between(data1, data2);
		
		if(fim.get(Calendar.HOUR_OF_DAY)>12) {
			dias=dias+1;
		}

		return dias;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [inicio=");
		builder.append(inicio);
		builder.append(", fim=");
		builder.append(fim);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
