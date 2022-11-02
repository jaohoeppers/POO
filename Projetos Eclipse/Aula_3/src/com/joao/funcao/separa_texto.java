package com.joao.funcao;

import java.util.Scanner;

public class separa_texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		
		
		System.out.println("Palavras: ");
		String texto=entrada.next();
		int k=0;
		//k recebe a quantidade de letras do tipo informado dentro de "";
		k=texto.split(" ").length;
		
		String[]separar=new String[k];
		separar=texto.split(" ");
		
		System.out.println("Palavras digitadas");
		
		for(int x=0;x<k; x++) {
			System.out.println(separar[x]+" | ");
		}
		entrada.close();
		
		
		
	}

}
