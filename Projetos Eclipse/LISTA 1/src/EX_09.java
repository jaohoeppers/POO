import java.util.Scanner;

public class EX_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor em graus farenheit: ");
		double grausf = entrada.nextDouble();
		
		double celcius = (grausf-32)/1.8;
				
		System.out.println("seu valor em graus celcius é de:"+celcius);
		
		entrada.close();
		
	}

}