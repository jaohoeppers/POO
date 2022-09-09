import java.util.Scanner;

public class EX_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Digite ate onde vai a escada");
		System.out.print("um valor inteiro");
		int num=entrada.nextInt();
		
		FUNCOES.escada1(num);
				
		entrada.close();
	}

}
