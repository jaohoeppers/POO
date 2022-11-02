import java.util.Scanner;

public class EX_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas sequencias?");
		int v = entrada.nextInt();
		
		int num1 = 1;
		int num2 = 1;
		
		System.out.println(num1+"/"+num2);
		
		for(int x=2;x<=v;x++) {
			num1=num1++;
			num2=num2+2;
			
		System.out.println(num1+"/"+num2);	
		}
			entrada.close();
	}

}
