import java.util.Scanner;

public class EX_02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ENTRADA = new Scanner (System.in);
		
		System.out.print("Digite um numero");
		
		int numero = ENTRADA.nextInt();
		System.out.println("O numero digitado foi: " + numero);
		
		ENTRADA.close();

	}

}