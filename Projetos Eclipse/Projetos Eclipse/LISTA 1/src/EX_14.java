import java.util.Scanner;

public class EX_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quanto voce recebe por hora?");
		float val = entrada.nextFloat();
		System.out.println("Quantas horas voce trabalhou?");
		float horas = entrada.nextFloat();
		
		float salariob = val*horas;
		float inss = (salariob/100)*8;
		float sindicato = (salariob/100)*5;
		float imposto = (salariob/100)*11;
		
		System.out.println("Seu salario bruto é de:"+salariob);
		System.out.println("Voce pagou: "+inss+" ao INSS.");
		System.out.println("Voce pagou: "+sindicato+" ao sindicato.");
		System.out.println("Voce pagou: "+imposto+" de impostos.");
		System.out.println("Salário Bruto : R$"+salariob);
		float x = salariob-imposto;
		System.out.println("- IR (11%) : R$"+x);
		x = x-inss;
		System.out.println("- INSS (8%) : R$"+x);
		x = x-sindicato;
		System.out.println("- Sindicato ( 5%) : R$"+x);
		System.out.println("= Salário Liquido : R$"+x);
		
		entrada.close();
	}

}
