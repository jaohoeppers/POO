import java.util.Scanner;

public class EX_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu raio: ");
		double raio = entrada.nextDouble();
		double area = (raio*2)*3.14;
		
		System.out.println("Sua area é de: "+area);
		
		entrada.close();
				
	}

}
