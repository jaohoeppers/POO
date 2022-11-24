import java.util.Scanner;

public class EX_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Voce deseja o fatorial de qual numero?");
		int fat = entrada.nextInt();
		int num1=fat;
		int num2=fat-1;
		int num3=0;
		
		for (int x=3;x<=fat ;x++) {
			num3 = num1*num2;
			num2 = num2-1;
			num1 = num3;			
		}
		
		System.out.println(num3);
		entrada.close();
	}
	
}
