import java.util.Scanner;

public class EX_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um ano com os quatro digitos");
		
		int ano = entrada.nextInt();
		
		if ((ano%4)=0) //mod//
		{
			System.out.println("Esse ano é bissexto");
		}
			else {
				System.out.println("Esse ano nao é bissexto");
			}	
		

	}

}
