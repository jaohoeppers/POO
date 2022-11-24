import java.util.Scanner;

public class EX_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Quantos alunos serao?");
		int alunos=entrada.nextInt();
		
		final int LIN2=2;
		final int LIN=3;
		float soma=0;
		float menorn=0;
		float maiorn=0;
		float maiorm=0;
		float menorm=0;
		String nomepm="x";
		String nomemm="x";
		String nomepn="x";
		String nomemn="x";
		
		String[] alu=new String[alunos];
		float[][] notas=new float[LIN2][alunos];
		float[] med=new float[alunos];
		
		for(int ALUNOS=0;ALUNOS<alunos;ALUNOS++) {
			for(int lin=0;lin<LIN;lin++) {
				if(lin==0){
					System.out.println("Digite o nome do aluno");	
					alu[ALUNOS]=entrada.nextLine();
					}
				if(lin==1){
					System.out.println("Digite aprimeira nota do aluno");		
					notas[lin-1][ALUNOS]=entrada.nextFloat();
					}
				if(lin==2){
					System.out.println("Digite a segunda nota do aluno");	
					notas[lin-1][ALUNOS]=entrada.nextFloat();
					}
				soma=soma+(notas[lin-1][ALUNOS]);
				med[ALUNOS]=soma/2;
				
				if(ALUNOS==0&&lin==0) {
					nomepn=alu[ALUNOS];
					nomemn=alu[ALUNOS];
					nomepm=alu[ALUNOS];
					nomemm=alu[ALUNOS];
					maiorn=notas[lin][ALUNOS];
					menorn=notas[lin][ALUNOS];
					maiorm=notas[lin][ALUNOS];
					menorm=notas[lin][ALUNOS];					
				}
				else {
					if(maiorn<notas[lin-1][ALUNOS]) {
						maiorn=notas[lin][ALUNOS];
					}
					if(menorn>notas[lin-1][ALUNOS]) {
						menorn=notas[lin][ALUNOS];
					}
					if(maiorm<notas[lin-1][ALUNOS]) {
						maiorn=notas[lin][ALUNOS];
					}
					if(maiorn<notas[lin-1][ALUNOS]) {
						maiorn=notas[lin][ALUNOS];
					}
				}
			}			
		}
		
		for(int ALUNOS=0;ALUNOS<alunos;ALUNOS++) {
			System.out.println("_______________");
			for(int lin=0;lin<LIN;lin++) {
				if(lin==0){
					System.out.println(alu[ALUNOS]);	
				}
				if(lin==1){
					System.out.println(notas[lin-1][ALUNOS]);		
				}
				if(lin==2){
					System.out.println(notas[lin-1][ALUNOS]);	
				}

			}
		}
		
		for(int x=0;x<alunos;x++) {
			System.out.println("A media do "+(x+1)+"º aluno é:"+med[x]);
		}
		
		
		
		
		
		
		
	}

}
