import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		
		final int lin=1;
		final int col=5;

		int[][] vet=new int[lin][col]; 
		
		for(int x=1;x<=5;x++) {
			System.out.println("digite um numero");
			vet[lin][x]=entrada.nextInt();
			}
		
		for(int x=1;x<=5;x++) {
			System.out.println(vet[lin][x]);
			}
		
		entrada.close();
		
	}

}
