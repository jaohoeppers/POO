import java.util.Scanner;

public class EX_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro, se ele for par eu o transformarei em impar e vici versa");

		int num = entrada.nextInt();
		
		num = (num+1);
				
		System.out.println("seu novo numero é: "+num);
		
		entrada.close();
		
	}

}
