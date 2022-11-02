import java.util.Scanner;

public class EX_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int base = entrada.nextInt();
		int expoente = entrada.nextInt();
		double num = base;
				
		for(int x=2;x<=expoente;x++) {
			num = num*base;
		}
		System.out.println(num);
		
		entrada.close();
		
	}

}
