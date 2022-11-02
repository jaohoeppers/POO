import java.util.Scanner;

public class EX_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome 'maior que 3 caracteres'");
		String nome = entrada.next();
		while(nome.length()<3) {
			System.out.println("Seu nome nao pode ser menor do que 3 caracteres. DIGITE NOVAMENTE");
			nome = entrada.next();
		}
		System.out.println("Digite sua idade 'entre 0 e 150'");
		int idade = entrada.nextInt();
		while(idade<0) {
			System.out.println("Sua idade nao pode ser menor do que 0. DIGITE NOVAMENTE");
			idade=entrada.nextInt();
			while(idade>150) {
				System.out.println("Sua idade nao pode ser maior do que 150. DIGITE NOVAMENTE");
				idade=entrada.nextInt();
			}
		}
		System.out.println("Digite seu salario 'maior do que zero'");
		double salario = entrada.nextDouble();
		while(salario<0) {
			System.out.println("Seu salario nao pode ser menor do que 0. digite novamente");
			salario=entrada.nextDouble();
		}
		System.out.println("Digite seu sexo 'M para masculino ou F para feminino'");
		String sexo = entrada.next();
		if (sexo.equalsIgnoreCase("m")) {
			
		}
		while(sexo.equalsIgnoreCase("m"))
		System.out.println("Digite seu estado civil 'S solteiro, C casado, V viuvo, D divorciado'");
		String estciv = entrada.next();
		while(sexo.equalsIgnoreCase(estciv));;;;;;//;/;/;/;/;/;/;/;/;/
		
		
		
		
		
		
		
	}

}
