import java.util.Scanner;

public class bbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe a base da taboada");
		int base = entrada.nextInt();
		
		System.out.println("informe o incio da taboada");
		System.out.println("ex: 5 X inicio ");
		int inic = entrada.nextInt();
		
		System.out.println("informe o final da taboada");
		System.out.println("ex: 5 X final ");
		int fim = entrada.nextInt();
		
		if (fim<inic) {
			for (int x = inic; x <= fim; x++);
			System.out.println(inic+"º: "+base+" X "+inic+" = "+(base*inic));
		}	
		if (inic<fim) {
			for (int x = inic; x <= fim; x++);
			System.out.println(inic+"º: "+base+" X "+inic+" = "+(base*inic));
		}
		
		
//		while (fim<inic) {
//			System.out.println("informe um final maior que o inicio");
//			fim = entrada.nextInt();
//		}
		
		}
	}


