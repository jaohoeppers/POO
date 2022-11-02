import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		System.out.println("Ola Mundo");

		Scanner entrada = new Scanner(System.in);
		
		//NUMEROS INTEIROS
		System.out.print("Informe um numero (int): ");
		int Num1 = entrada.nextInt();
		System.out.println("Num1:" + Num1);
		
		//NUMEROS REAIS
		System.out.print("Informe um numero (Float): ");
		float Numf = entrada.nextFloat();
		System.out.println("Numf:" + Numf);
		
		//NUMEROS MAIORES
		System.out.print("Informe um numero (double): ");
		double Numd = entrada.nextDouble();
		System.out.println("Numd:" + Numd);
		
		//LIMPAR O BUFFER PRA CONSEGUIR DIGITAR
		entrada.nextLine();
		
		//TEXTO COM ESPAÇO
		System.out.print("Informe um texto: ");
		String texto = entrada.nextLine();
		System.out.println("texto:" + texto);
		
		//UNICA LETRA
		System.out.print("Informe um texto: ");
		char letra = entrada.nextLine().charAt(0);
		System.out.println("letra:" + letra);
		
		entrada.close();
		
	}

}
