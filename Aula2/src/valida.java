import java.util.Scanner;

public class valida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("informe um numero positivo");
		int num = entrada.nextInt();
		
		System.out.println("informe um inicio");
		int inicio = entrada.nextInt();
		
		System.out.println("informe um final");
		int fim = entrada.nextInt();
		
		while (fim<inicio) {
			System.out.println("informe um numero final maior que o inicial");
			fim = entrada.nextInt();
		}
		
		//OU 
		
		fim = -1;
		while (fim<0) { 
			System.out.println("informe um numero final maior que o inicial");
			fim = entrada.nextInt();	
		}
		int z = 0;
		
		for (z = inicio; z <=fim; z++){
			System.out.println(z+"º: "+num+" X "+z+" = "+(num*z));
		}
				
		//do faz while testa do while vai fazer pelo menos uma vez
		do { 
			
		}while(num < 0);
		
		String f = j;
		String teste = "f";
		
		//ver se a letra é igual
		if (teste.equals("f"));
		//ver se a letra é igual 'ignora capslock'
		if (teste.equalsIgnoreCase(f));
		//verifica se o tamanho da frase é menor do que 3
		if (teste.length()>3);
		//pega quantas letras tem a palavra e guarda na variavel
		int tamanho = teste.length();
		
		entrada.close();
		
		
		
	}

}
