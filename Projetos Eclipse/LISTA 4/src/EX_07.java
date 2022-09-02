import java.util.Scanner;

public class EX_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		int[] todos=new int[5];
		float prod=0;
		float soma=0;
		
		for(int x=0;x<=4;x++) {
			System.out.println("Digite seu "+(x+1)+"º numero");
			todos[x]=entrada.nextInt();}
		
			prod=(todos[0]*todos[1]*todos[2]*todos[3]*todos[4]);
			soma=(todos[0]+todos[1]+todos[2]+todos[3]+todos[4]);
		
			System.out.println("O produto dos numeros foi: "+prod);
			System.out.println("A soma dos numeros foi: "+soma);
			System.out.print("Todos os numeros sao: ");
			for(int x=0;x<=4;x++) {
				System.out.print(todos[x]+" ");
			}
			entrada.close();
	}

}
