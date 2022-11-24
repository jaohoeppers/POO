import java.util.Scanner;

public class EX_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Digite seus 3 valores");
		
		double num=entrada.nextDouble();
		double num1=entrada.nextDouble();
		double num2=entrada.nextDouble();
		
		double soma=FUNCOES.soma(num, num1, num2);
		
		System.out.println("A soma total foi: "+soma);
		entrada.close();
	}

}
