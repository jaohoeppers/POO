import java.util.Scanner;

public class EX_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual tabuada desejas?");
		int tab = entrada.nextInt();
		
		for(int x=0; x<=10;x++) {
			int res = x*tab;
			System.out.println(tab+" X "+x+" = "+res);}
		
	entrada.close();
	}

}
