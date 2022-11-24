import java.util.Scanner;

public class EX_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		int col=0;
		int lin=0;
		final int COL=3;
		final int LIN=3;
		float[][] mer1=new float[COL][LIN];
		float[][] mer2=new float[COL][LIN];
		float[][] mer3=new float[COL][LIN];
		float[][] mer4=new float[COL][LIN];
		float[][] mer5=new float[COL][LIN];
		
		
		 
		System.out.println("Digite os valores dos produtos do seu 1º supermercado");
		for(col=1;col<COL;col++) {
			System.out.println((col+1)+"º COLUNA");
			for(lin=0;lin<LIN;lin++) {
				System.out.println((lin+1)+"º LINHA");
				System.out.print(":");
				if(col==1&&lin==0) {lin=lin+1;}
				mer1[col][lin]=entrada.nextFloat();
		}	}
		System.out.println("Digite os valores dos produtos do seu 2º supermercado");
		for(col=1;col<COL;col++) {
			System.out.println((col+1)+"º COLUNA");
			for(lin=0;lin<LIN;lin++) {
				System.out.println((lin+1)+"º LINHA");
				System.out.print(":");
				if(col==1&&lin==0) {lin=lin+1;}
				mer1[col][lin]=entrada.nextFloat();
		}	}
		System.out.println("Digite os valores dos produtos do seu 3º supermercado");
		for(col=1;col<COL;col++) {
			System.out.println((col+1)+"º COLUNA");
			for(lin=0;lin<LIN;lin++) {
				System.out.println((lin+1)+"º LINHA");
				System.out.print(":");
				if(col==1&&lin==0) {lin=lin+1;}
				mer1[col][lin]=entrada.nextFloat();
		}	}
		System.out.println("Digite os valores dos produtos do seu 4º supermercado");
		for(col=1;col<COL;col++) {
			System.out.println((col+1)+"º COLUNA");
			for(lin=0;lin<LIN;lin++) {
				System.out.println((lin+1)+"º LINHA");
				System.out.print(":");
				if(col==1&&lin==0) {lin=lin+1;}
				mer1[col][lin]=entrada.nextFloat();
		}	}
		System.out.println("Digite os valores dos produtos do seu 5º supermercado");
		for(col=1;col<COL;col++) {
			System.out.println((col+1)+"º COLUNA");
			for(lin=0;lin<LIN;lin++) {
				System.out.println((lin+1)+"º LINHA");
				System.out.print(":");
				if(col==1&&lin==0) {lin=lin+1;}
				mer1[col][lin]=entrada.nextFloat();
		}	}
		
		float soma1=0;
		float soma2=0;
		float soma3=0;
		float soma4=0;
		float soma5=0;
		
		
		System.out.println("Itens do mercado 1:");
		for(col=1;col<COL;col++) {
			System.out.println();
			for(lin=0;lin<LIN;lin++) {
				System.out.print(mer1[col][lin]+"|");
				soma1= soma1+(mer1[col][lin]);
			}
		}
		System.out.println("Itens do mercado 1:");
		for(col=1;col<COL;col++) {
			System.out.println();
			for(lin=0;lin<LIN;lin++) {
				System.out.print(mer2[col][lin]+"|");
				soma2= soma2+(mer2[col][lin]);
			}
		}
		System.out.println("Itens do mercado 1:");
		for(col=1;col<COL;col++) {
			System.out.println();
			for(lin=0;lin<LIN;lin++) {
				System.out.print(mer3[col][lin]+"|");
				soma3= soma3+(mer3[col][lin]);
			}
		}
		System.out.println("Itens do mercado 1:");
		for(col=1;col<COL;col++) {
			System.out.println();
			for(lin=0;lin<LIN;lin++) {
				System.out.print(mer4[col][lin]+"|");
				soma4= soma4+(mer4[col][lin]);
			}
		}
		System.out.println("Itens do mercado 1:");
		for(col=1;col<COL;col++) {
			System.out.println();
			for(lin=0;lin<LIN;lin++) {
				System.out.print(mer5[col][lin]+"|");
				soma5= soma5+(mer5[col][lin]);
			}
		}
		
		System.out.println("Soma dos itens do mercado 1: "+soma1);
		System.out.println("Soma dos itens do mercado 2: "+soma2);
		System.out.println("Soma dos itens do mercado 3: "+soma3);
		System.out.println("Soma dos itens do mercado 4: "+soma4);
		System.out.println("Soma dos itens do mercado 5: "+soma5);
		
		
		
	}

}
