package com.joao.funcao; 

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println(menu());
		
		double n1=entrada.nextDouble();
		
	}
	
	
	public static String menu() {
		String saida="##MENU##\n";
		saida+="1 - INSERIR\n";
		saida+="2 - ALTERAR\n";
		saida+="3 - EXCLUIR\n";
		saida+="4 - LISTAR\n";
		saida+="Digite sua opção";
		return saida;
	}
	public static double inserir(double n2) {
		return(n2);
	}
	public static double alterar(double n2) {
		return(n2);
	}
	public static double excluir(double n2) {
		return(n2);
	}
	public static double listar(double n2) {
		return(n2);
	}

}
