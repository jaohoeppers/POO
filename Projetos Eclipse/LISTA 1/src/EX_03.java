import java.util.Scanner;

public class EX_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.print("digite 2 numeros inteiros: ");
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		
		double soma = (num1)+(num2);
		System.out.println("a soma dos numeros é: "+(soma));
		
		entrada.close();
	}
}
