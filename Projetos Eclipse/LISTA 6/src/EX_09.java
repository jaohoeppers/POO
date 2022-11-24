import java.util.Scanner;

public class EX_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		String pa=entrada.next();		
		System.out.println("Seu numero ao contrario é:");
		FUNCOES.contrario2(pa);
		
		System.out.println("Digite um numero inteiro======");
		pa=entrada.next();		
		System.out.println("Seu numero ao contrario é:======");
		System.out.println(FUNCOES.contrario(pa));
		entrada.close();


	}

}
