import java.util.Scanner;

public class EX_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int soma = 0;
		
		if(num2>num1) {
			for(int x=num1;x<=num2;x++) {
				System.out.println(x);
				soma = soma+x;}}
		
		if(num1>num2) {
			for(int x=num2;x<=num1;x++) {
				System.out.println(x);
				soma = soma+x;}}
		
		System.out.println("soma dos numeros é: "+soma);
		
	entrada.close();
	}

}
