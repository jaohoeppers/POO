import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		String dias = entrada.nextLine();
		double anos= entrada.nextDouble();
		double meses= entrada.nextDouble();
		
		double valor=(anos+(meses/100)*15);
		
		
		
	
		System.out.printf("TOTAL = R$ "+"%.2f",valor);
		
		
	}
}


//System.out.println((Format.String)"%.2f");