import java.util.Scanner;

public class EX_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Digite seu valor");
		double x=entrada.nextDouble();
		
		FUNCOES.posneg(x);
		
		entrada.close();
	}

}
