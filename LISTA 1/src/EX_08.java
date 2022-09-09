import java.util.Scanner;

public class EX_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o valor das suas horas trabalhadas? : ");
		double vhoras = entrada.nextDouble();
		System.out.println("Quantas horas foram trabalhadas no mes? : ");
		double horas = entrada.nextDouble();
		
		double salario = vhoras*horas;
				
		System.out.println("seu salario do mes é de R$:"+salario);
		
		entrada.close();
		
	}

}
