import java.util.Scanner;

public class EX_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		final int col=4;
		float soma=0;
		
		float []vet=new float[col];
		
		for(int x=1;x<=col;x++) {
			System.out.println("Digite suas 4 notas");
			vet[x]=entrada.nextFloat();
		}
		System.out.println("Suas notas foram");
		for(int x=1;x<=col;x++) {
			System.out.println(" "+vet[x]+" ");
			soma=(soma+vet[x]);
		}
		System.out.println("Sua media foi de: "+(soma/col));
		entrada.close();
	}

}
