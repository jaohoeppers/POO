import java.util.Scanner;

public class EX_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Digite o valor da prestação : ");
		float pres=entrada.nextFloat();
		System.out.print("Digite quantos dias de atraso: ");
		int dias=entrada.nextInt();
		
		int xo=10;
		int cont=-1;
		
		double[] vet=new double [xo];
		
		int x=0;
		while(x!=0) {
			double total=FUNCOES.prestacao(pres, dias);
			cont++;
			vet[cont]=total;
			
			}
			for(int po=0;po<cont;po++) {
				System.out.println(vet[po]);
				System.out.println("As prestaçoes do dia foram: "+cont);
		}
		entrada.close();
	}

}
