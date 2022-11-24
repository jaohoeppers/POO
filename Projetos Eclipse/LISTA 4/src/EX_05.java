import java.util.Scanner;

public class EX_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int cont2=0;
		int cont=0;
		int[]todos=new int[22];
		int[]impar=new int[22];
		int[]par=new int[22];
		
		
		
		for(int x=1;x<=20;x++) {
			System.out.println("Digite seu "+x+"º numero");
			todos[x]=entrada.nextInt();}
		
		for(int x=1;x<=20;x++) {
			
			if((todos[x]%2)==0) {
				cont++;
				par[cont]=todos[x];}
			else {
				cont2++;
				impar[cont2]=todos[x];}
			}
		System.out.print("Todos os seu numeros foram: ");
		for(int x=1;x<=20;x++) {
			System.out.println(todos[x]);
		}
		System.out.print("Seus valores pares foram: ");
		for(int x=1;x<=cont;x++) {
			System.out.println(par[x]);
		}
		System.out.print("Seus valores pares foram: ");
		for(int x=1;x<=cont2;x++) {
			System.out.println(impar[x]);
		}
		entrada.close();
	}

}
