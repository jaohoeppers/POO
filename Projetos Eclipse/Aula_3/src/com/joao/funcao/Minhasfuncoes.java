package com.joao.funcao;

import java.util.Random;

public class Minhasfuncoes {

	public static int[] criaVetor(int tamanho){
		Random gerador = new Random();
		int[]v = new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			v[i] = gerador.nextInt(100);
		}
		return v;
	}
	
	public static String mostrar (int[]v){
		String saida="";
		for(int i=0;i<v.length;i++) {
			saida=saida+v[i]+" | ";
		}
		return saida;
	}
	
	public static String mostrarTop (int[]v){
		StringBuilder saida=new StringBuilder();
		for(int i=0;i<v.length;i++) {
			saida.append(v[i]);
			saida.append(" | ");
		}
		return saida.toString();
	}
	
	public static void escada(int x) {
		
		for(int d=1;d<=x;d++) {
			System.out.println("");
			for(int q=1;q<=d;q++) {
				System.out.print(d);
			}
		}
	}
	
	public static String escada2 (int x){
		StringBuilder saida=new StringBuilder();
		for(int d=1;d<x;d++) {
			for(int q=1;q<=d;q++) {
				saida.append(d);
			}
			
			saida.append("\n");
		}
		return saida.toString();
	}
	
	public static int contador(String x) {
		int tam= x.length();
		return tam;
	}
	
	
}
