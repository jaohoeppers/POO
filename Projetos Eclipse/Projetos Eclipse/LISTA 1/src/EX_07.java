import java.util.Scanner;

public class EX_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os lados do seu quadrado: ");
		double lado1 = entrada.nextDouble();
		double lado2 = entrada.nextDouble();
		double area = lado1*lado2;
		
		System.out.println("Sua area é de: "+area);
		
		entrada.close();
				
	}

}