import java.util.Scanner;

public class EX_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro impar entre 3 e 11");
		int ent=entrada.nextInt();
		
		while(ent%2==0) {
						
			System.out.println("Voce digitou um numero invalido.");
			System.out.println("Digite novamente");
			ent=entrada.nextInt();
		}
		int maior=0;
		int menor=0;
		int contp=0;
		int conti=0;
		int col=0;
		int lin=0;
		final int LIN=ent;
		final int COL=ent;
		int[][] vet=new int[LIN][COL];
		
		System.out.println("Digite os valores da sua matriz");
		for(col=0;col<COL;col++) {
			System.out.println((col+1)+"º COLUNA");
			for(lin=0;lin<LIN;lin++) {
				System.out.println((lin+1)+"º LINHA");
				System.out.print(":");
				vet[col][lin]=entrada.nextInt();
				
				if( col==0&&lin ==0) {
					maior=vet[col][lin];
					menor=vet[col][lin];}
				else {
					if(vet[col][lin]>maior){
						maior=vet[col][lin];}
					if(vet[col][lin]<menor) {
						menor=vet[col][lin];}
				}
				
				if((vet[col][lin])%2==0) {
					contp++;}
				else {conti++;}
			}
		}
		
		float soma=0;
		
		for(col=0;col<COL;col++) {			
			for(lin=0;lin<LIN;lin++) {
				soma=(soma+(vet[col][lin]));
			}
		}
		
		float somads=0;
		float somadp=0;
		lin=0;
		
	//	for(col=0;col<COL;col++) {								
	//			somadp=(somadp+(vet[col][lin]));
	//			lin++;			
	//	}
	//	lin=COL;
	//	for(col=COL;col>0;col--) {								
	//		somads=(somads+(vet[col][lin]));
	//		lin--;			
	//	}	
		
		System.out.println("Soma dos elementos: "+soma);
		System.out.println("Media dos elementos: "+(soma/(ent*ent)));
		System.out.println("O maior elemento: "+maior);
		System.out.println("O menor elemento: "+menor);
		System.out.println("Contador de pares: "+contp);
		System.out.println("Contador de impares: "+conti);
		System.out.println("Soma da diagonal principal: "+somadp);
		System.out.println("Soma da diagonal secundaria: "+somads);
		for(col=0;col<COL;col++) {
			System.out.println();
			for(lin=0;lin<LIN;lin++) {
				System.out.print(+vet[col][lin]+"|");
			}
		}
		
		
	entrada.close();	
	}

}
