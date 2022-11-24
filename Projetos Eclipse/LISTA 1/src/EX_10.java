import java.util.Scanner;

public class EX_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite 2 numeros inteiros: ");
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		System.out.print("Digite um numero real: ");
		
		float num3 = entrada.nextFloat();
		
		float primeiro = (num1*2)*(num2/2);
		float segundo = num1*3 + num3;
		float terceiro = num3*num3*num3;
		
		System.out.println("A: "+primeiro);
		System.out.println("B: "+segundo);
		System.out.println("C: "+terceiro);
		
		entrada.close();
		
	}

}
