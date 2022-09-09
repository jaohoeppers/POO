import java.util.Scanner;

public class EX_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite seu horario em 2 numeros inteiros");
		int h1=entrada.nextInt();
		int h2=entrada.nextInt();
		
		FUNCOES.convhorario(h1, h2);
		entrada.close();
				
	}

}
