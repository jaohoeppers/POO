import java.util.Scanner;

public class EX_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas deseja calcular?");
		int notas=entrada.nextInt();
		int x=1;
		float soma=0;
		
		while(x<=notas) {
			x++;
			System.out.println("digite sua nota");
			float nota=entrada.nextFloat();
			soma=soma+nota;
		}
	System.out.println("Sua media é de: "+(soma/notas) );
		
		entrada.close();
		
	}

}
