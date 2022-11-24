import java.util.Scanner;

public class EX_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Boa tarde João, quantos quilos pescou hoje? : ");
		float peso = entrada.nextFloat();
		
		if (peso>50);
	
			float excesso = peso-50;
			float multa = excesso*4;
			System.out.println("Voce ultrapassou o limite imposto pelo estado João,");
			System.out.println("vai ter que pagar uma multa de R$:4,00 sob o peso escedente.");
			System.out.print("A multa é de: R$"+multa);
			
		else System.out.println("Voce ficou dentro do limite de peso imposto pelo estado,");
			 System.out.println("nao tera de pagar multa hoje, continue assim.");
		
	}

}
