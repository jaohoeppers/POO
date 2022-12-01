package com.classes.mainFaturamento;

import java.sql.Date;

import com.classes.BO.FaturamentoBO;
import com.classes.DTO.Faturamento;

public class MainInsercao {
	public static void main(String[] args) {
		
		Date inicio = new Date(0);
		Date fim = new Date(0);
		
		// Teste Inserir
		FaturamentoBO marcaBO = new FaturamentoBO();
		Faturamento marca = new Faturamento(500.00,inicio,fim);
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		marca = new Faturamento(200.00,inicio,fim);
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		marca = new Faturamento(55.00,inicio,fim);
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}