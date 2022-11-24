import java.util.Scanner;

public class EX_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		float[] alts=new float[5];
		int []idad=new int[5];
		float malto=0;
		float mbaixo=1000000;
		int mvelho=0;
		int mnovo=1000000;
		
		
		System.out.println("Digite as alturas");
		
		for(int x=0;x<=4;x++) {
			alts[x]=entrada.nextFloat();
			if(alts[x]>malto) {
				malto=alts[x];
			}
			if(alts[x]<mbaixo) {
				mbaixo=alts[x];
			}
		}
		System.out.println("Digites as idades");
		
		for(int x=0;x<=4;x++) {
			idad[x]=entrada.nextInt();
			if(idad[x]>mvelho) {
				mvelho=idad[x];
			}
			if(idad[x]<mnovo) {
				mnovo=idad[x];
			}
		}
		float somai=0;
		float somaa=0;
		float midad=0;
		float malt=0;
		
		for(int x=0;x<=4;x++) {
			somaa=alts[x]+somaa;
			somai=idad[x]+somai;
		}
		midad=somai/5;
		malt=somaa/5;
		
		
		
		System.out.println("A/\nlturas ao contrario");
		for(int x=4;x>=0;x--) {
			System.out.print(" "+alts[x]+" ");
		}
		System.out.println("\nIdades ao contrario");
		for(int x=4;x>=0;x--) {
			System.out.print(" "+idad[x]+" ");
		}
		System.out.println();
		System.out.println("\nMEDIA IDADE: "+midad);
		System.out.println("\nMEDIA ALTURA: "+malt);
		System.out.println();
		
		System.out.println("\nIdades acima da media");
		for(int x=0;x<=4;x++) {
			if(idad[x]>midad) {
				System.out.print(" "+idad[x]+" ");
			}
		}
		System.out.println("\nIdades abaixo da media");
		for(int x=0;x<=4;x++) {
			if(idad[x]<midad) {
				System.out.print(" "+idad[x]+" ");
			}			
		}
		
		System.out.println("\nAlturas acima da media");
		for(int x=0;x<=4;x++) {
			if(alts[x]>malt) {
				System.out.print(" "+alts[x]+" ");
			}
		}
		System.out.println("\nAlturas abaixo da media");
		for(int x=0;x<=4;x++) {
			if(alts[x]<malt) {
				System.out.print(" "+alts[x]+" ");
			}
		}
		entrada.close();
	}

}
