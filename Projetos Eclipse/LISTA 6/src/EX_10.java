import java.util.Scanner;

public class EX_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem vindo ao jogo de craps");
		System.out.println("Tecle 0 para jogar");
		int nada=entrada.nextInt();
		
		FUNCOES.craps(nada);
		entrada.close();
	}

}
