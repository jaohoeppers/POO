import java.util.Scanner;

public class EX_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite sua altura: ");
		
		float altura = entrada.nextInt();
		
		double pesoid = (72.7*altura)-58;
		
		System.out.println("Seu peso ideal é de: "+pesoid);
		
		entrada.close();
		
	}

}