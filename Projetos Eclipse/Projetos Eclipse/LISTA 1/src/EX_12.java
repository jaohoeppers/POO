import java.util.Scanner;

public class EX_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite sua altura: ");
		
		float altura = entrada.nextInt();
		
		System.out.println("Voce é homem ou mulher?");
		System.out.print("Digite 1 para homem e 2 para mulher: ");
		
		int val = entrada.nextInt();
		double pesoid;
		if (val==0){
			pesoid = (72.7*altura)-58;
		} else {
			pesoid = (62.1*altura)-44.7;
		}
		System.out.println("Seu peso ideal é de: " + pesoid);
		
		entrada.close();
		
	}

}