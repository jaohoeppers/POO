package com.classes.mainVeiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainAlteracao {

	public static void main(String[] args) {
			
		// Teste Alterar	
		VeiculoBO marcaBO = new VeiculoBO();
		Veiculo marca = new Veiculo(1,"Fiat Fiurino Tunadona",(float)20.50,"sim");
		marcaBO.alterar(marca);
		marca = marcaBO.procurarPorCodigo(marca);
		System.out.println(marca);
		
	}
}