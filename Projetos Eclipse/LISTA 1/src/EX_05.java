import java.util.Scanner;

public class EX_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu valor em metros: ");
		double valor = entrada.nextDouble();
		double vconv = valor*100;
		System.out.println("Seu valor convertido em CM é: "+vconv);
		
		entrada.close();
		
	}

}
