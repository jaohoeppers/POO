import java.util.Scanner;

public class EX_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int col=0;
		
		float[] vet=new float[col];
		
		float soma=0;
		float media=0;
		int cont=0;
		
		for(int x=1;x<=10;x++) {
			for (int y=1;y<=4;y++) {
				System.out.println("Digite sua "+y+"º nota");
				float nota=entrada.nextFloat();
				soma=soma+nota;
				media=soma/4;
			}
			col++;
			vet[x]=media;
		}
		
		for(int x=1;x<=col;x++) {
			if(vet[x]>=7) {
			cont++;}
		}
		
		System.out.println("Total de alunos com media maior ou igual a 7 é: "+cont);
		
		entrada.close();
	}

}
