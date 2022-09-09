import java.util.Scanner;

public class EX_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new scanner(Systen.in);
		
		System.out.println("Digite um valor positivo, negativo ou nulo.");
		
		float valor = entrada.nextFloat();
		
		if (valor>0);
			System.out.println("Seu valor é positivo");
		if (valor<0);
			System.out.println("Seu valor é negativo");
		if (valor=0);
			System.out.println("Seu valor é nulo");
			
		entrada.close();
	}

}
