import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite uma nota entre 0 e 10");
		
		int nota = entrada.nextInt();
		
		boolean certo = true;
		
		while (certo) {
		if (0<= nota||nota<= 10){
			System.out.println("digite uma nota valida entre 0 e 10");
			}
		if (0 <=nota||nota<=10){
			certo = false;
		}
		}
		entrada.close();
	}

}
