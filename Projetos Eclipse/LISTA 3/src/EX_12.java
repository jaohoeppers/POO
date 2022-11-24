import java.util.Scanner;

public class EX_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quer quantos termos na sequencia?");
		int fim = entrada.nextInt();
		int num1 = 1;
		int num2 = 1;
		int num3 = 1;
		System.out.println("1");
		System.out.println("1");
		for (int x=3;x<=fim;x++) {
			
			num3 = num1+num2;
			num2 = num1;
			num1 = num3;
			
			System.out.println(num3);
		}
		
		entrada.close();
	}

}
