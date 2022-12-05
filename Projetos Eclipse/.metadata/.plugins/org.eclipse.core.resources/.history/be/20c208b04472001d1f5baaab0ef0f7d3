package com.classes.main;

import com.classes.BO.MarcaBO;
import com.classes.DTO.Marca;

public class MainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
		MarcaBO marcaBO = new MarcaBO();
		Marca marca = new Marca("Dell",2);
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		marca = new Marca("Android",5);
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		marca = new Marca("LG",6);
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}