import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Digite ate qual numero a escada vai: ");
		int num=entrada.nextInt();

		FUNCOES.escada(num);
		
		System.out.println("-----------------------");
		
		System.out.println(FUNCOES.escada2(num));
		
		
		entrada.close();
		
	}	

}
