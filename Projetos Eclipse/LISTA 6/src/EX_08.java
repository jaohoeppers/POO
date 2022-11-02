import java.util.Scanner;

public class EX_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite um  numero inteiro");
		String num=entrada.next();
		
		int x=FUNCOES.contador(num);
		
		System.out.println("Seu numero tem "+x+" caracteres");
		entrada.close();
	}

}
