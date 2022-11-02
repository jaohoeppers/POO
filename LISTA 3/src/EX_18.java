import java.util.Scanner;

public class EX_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		int num = entrada.nextInt();		
		int prim=0;
		int cont=0;
		for(int x=2;x<=num;x++) {
		
			if(num%x==0) {	
			cont++;
			System.out.println("Este numero é divisivel por "+x);
				if(cont==1) {
				prim = x;
				}
			}			
		}
			
			if(prim==num) {
			System.out.println("Esse numero é primo");	
			}
			
		
			else{
			System.out.println("Esse numero nao é primo");
			}
		entrada.close();
	}

}