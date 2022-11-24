import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Informe o tamanho da fita: ");
		int tam=entrada.nextInt();
		boolean x=false;
		entrada.next();
		String[]fita=new String[tam];
		
		TRNA trna=new TRNA(tam);
		
		for (int i = 0; i < fita.length; i++) {
			x=true;
			do {
			System.out.print("Informe o RNA (A,T,G,C): ");
			fita[i]=String.valueOf(entrada.nextLine().charAt(0)).toUpperCase();
			
			if(fita[i].equals("A")||fita[i].equals("T")||fita[i].equals("G")||fita[i].equals("C")) {	
				x=false;
			}
			else {
				System.out.println("Voce digitou um valor nao compativel");
				System.out.println("Digite novamente");
			}
			}while(!x);
		}
		
		/*for (int i = 0; i < fita.length; i++) {
			do {
			System.out.print("Informe o RNA (A,T,G,C): ");
			fita[i]=String.valueOf(entrada.nextLine().charAt(0)).toUpperCase();
			
			if(!fita[i].equals("A")&&
					!fita[i].equals("T")&&
					!fita[i].equals("G")&&
					!fita[i].equals("C")){	
				System.out.println("Por favor somente (A,T,G,C)");}
			}while(!fita[i].equals("A")&&
					!fita[i].equals("T")&&
					!fita[i].equals("G")&&
					!fita[i].equals("C"));
		}*/
		

		
		
		
		
		
		entrada.close();
	}

}
