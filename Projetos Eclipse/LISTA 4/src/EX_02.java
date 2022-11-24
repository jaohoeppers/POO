import java.util.Scanner;

public class EX_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		final int col=10;
		int x=0;
		
		float[] vet=new float[col];
		
		System.out.println("Digite 10 numeros");
		
		for(x=1;x<=col;x++) {
			System.out.print("Digite seu "+x+"º numero");			
			vet[x]=entrada.nextFloat();
		} 
		for(x=col;x>=1;x--) {
			System.out.print("Seu "+x+"º numero foi:"+vet[x]);
		}
		
	}

}
