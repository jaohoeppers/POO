import java.util.Scanner;

public class EX_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		int fim = entrada.nextInt();		
		int cont=0;
		
		for(int x=2;x<=fim;x++) {
			int z=2;
				for(z=2;z<=x;z++) {
					if(x%z==0) {
						cont++;
						if(cont>1) {
							System.out.println("O numero "+x+" Não é primo e é divisivel por "+z);
						}
					}
				}
				
				if(cont==1) {
				System.out.println("Esse numero é primo: "+x);
				
				}

				cont=0;
		}
		
		
			
		entrada.close();
	}

}