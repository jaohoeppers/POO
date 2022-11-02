import java.util.Scanner;

public class PROVA_1 {

	public static void main(String[] args) {
		
		funcao2 mudar=new funcao2();
		
		Scanner entrada=new Scanner(System.in);

		System.out.println("Digite o tamanho da cadeia de ribonucleotideos, com um numero inteiro");
		mudar.setTamanho(entrada.nextInt());
		String[] tab=new String[mudar.getTamanho()];
		
		int x=0;
		while(x!=mudar.getTamanho()){
			System.out.println("Digite seu "+(x+1)+"º valor");
			String z=entrada.next();
			if(z.equalsIgnoreCase("a")||z.equalsIgnoreCase("t")||z.equalsIgnoreCase("g")||z.equalsIgnoreCase("c")) {
				tab[x]=z;
				x++;
			}
			else {System.out.println("Esse valor nao é compativel");
				System.out.println("Digite outro");
				}
			
		}
		mudar.setVar(tab);
		
		
		
	}

}
