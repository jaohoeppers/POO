import java.util.Scanner;

public class EX_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		int col=10;
		int cons=0;
		
		String[] vet=new String[col]; 
		
		for(int x=1;x<=col;x++) {
			System.out.println("Digite 10 letras");
			vet[x]=entrada.nextLine();
		}
		for(int x=1;x<=col;x++) {
			if(!(vet[x].equalsIgnoreCase("a"))||(vet[x].equalsIgnoreCase("e"))||(vet[x].equalsIgnoreCase("i"))||(vet[x].equalsIgnoreCase("o")||(vet[x].equalsIgnoreCase("u")))) {
				System.out.println("A letra: "+vet[x]+" é uma consoante");
				cons++;
			}
		}
		System.out.println("O total de consoantes foi: "+cons);
		entrada.close();
	}

}
