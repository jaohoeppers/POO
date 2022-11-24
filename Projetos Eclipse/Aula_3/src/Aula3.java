import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int lin = 5;
		final int col = 5;
		float maior = 0;
		float menor =1000;
		int soma=0;
		int cont =1;
		
		int[][] vet=new int[lin][col];
		
		for(int x=0;x<lin;x++) {					
			
			for(int y=0;y<col;y++) {
			
				System.out.print("Digite a idade do "+(cont)+"º membro da sua familia");
				System.out.print("um de cada vez :");
			
				cont++;
				
				vet[x][y] = entrada.nextInt();	
			
				if(x==0) {
					maior=vet[x][y];
					menor=vet[x][y];
				}
				
				if(vet[x][y]>maior) {
					maior=vet[x][y];
				}
				if(vet[x][y]<menor) {
					menor=vet[x][y];
				}
			}	
		}
			
		for(int x=0;x<lin;x++) {
			System.out.println("\n");
			for(int y=0;y<col;y++) {
				System.out.print(vet[x][y]+"|");
				soma=soma+vet[x][y];
			}
		}
			
		float media=(soma/lin);
			
		System.out.println("\n A soma das idades deu: "+soma);
		System.out.println("\n A media das idades deu: "+media);
		System.out.println("\n O menor numero digitado foi: "+menor);
		System.out.println("\n O maior numero digitado foi: "+maior);
		
		entrada.close();
	}
}
